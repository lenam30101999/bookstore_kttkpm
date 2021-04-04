CREATE TABLE `cart` (
                        `Id` int NOT NULL AUTO_INCREMENT,
                        `TotalQty` int NOT NULL,
                        PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `customer` (
                            `Id` int NOT NULL AUTO_INCREMENT,
                            `age` int NOT NULL,
                            `phoneNo` varchar(255) DEFAULT NULL,
                            `username` varchar(255) DEFAULT NULL,
                            `password` varchar(255) DEFAULT NULL,
                            `street` varchar(50) DEFAULT NULL,
                            `country` varchar(50) DEFAULT NULL,
                            `firstName` varchar(50) DEFAULT NULL,
                            `middleName` varchar(50) DEFAULT NULL,
                            `lastName` varchar(50) DEFAULT NULL,
                            `city` varchar(50) DEFAULT NULL,
                            PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `item` (
                        `Id` int NOT NULL AUTO_INCREMENT,
                        `Name` varchar(255) DEFAULT NULL,
                        `Qty` int NOT NULL,
                        `price` int NOT NULL,
                        PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `cart_Iiem` (
                             `CartId` int NOT NULL,
                             `ItemId` int NOT NULL,
                             PRIMARY KEY (`CartId`,`ItemId`),
                             KEY `FKcart_Iiem806900` (`ItemId`),
                             CONSTRAINT `FKcart_Iiem806900` FOREIGN KEY (`ItemId`) REFERENCES `item` (`Id`),
                             CONSTRAINT `FKcart_Iiem931479` FOREIGN KEY (`CartId`) REFERENCES `cart` (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `payment` (
                           `Id` int NOT NULL AUTO_INCREMENT,
                           `CartId` int NOT NULL,
                           `Price` bigint NOT NULL,
                           PRIMARY KEY (`Id`),
                           KEY `FKpayment613095` (`CartId`),
                           CONSTRAINT `FKpayment613095` FOREIGN KEY (`CartId`) REFERENCES `cart` (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `order` (
                         `Id` int NOT NULL AUTO_INCREMENT,
                         `CartId` int NOT NULL,
                         `PaymentId` int NOT NULL,
                         `CustomerId` int NOT NULL,
                         `Date` date DEFAULT NULL,
                         `TotalPrice` bigint NOT NULL,
                         PRIMARY KEY (`Id`),
                         KEY `FKorder465284` (`CustomerId`),
                         KEY `FKorder777220` (`PaymentId`),
                         KEY `FKorder301676` (`CartId`),
                         CONSTRAINT `FKorder301676` FOREIGN KEY (`CartId`) REFERENCES `cart` (`Id`),
                         CONSTRAINT `FKorder465284` FOREIGN KEY (`CustomerId`) REFERENCES `customer` (`Id`),
                         CONSTRAINT `FKorder777220` FOREIGN KEY (`PaymentId`) REFERENCES `payment` (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;