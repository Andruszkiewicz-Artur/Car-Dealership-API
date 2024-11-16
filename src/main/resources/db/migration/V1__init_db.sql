DROP SEQUENCE IF EXISTS "car_id_seq";
CREATE SEQUENCE "car_id_seq" INCREMENT BY 50 START 1;

DROP SEQUENCE IF EXISTS "user_id_seq";
CREATE SEQUENCE "user_id_seq" INCREMENT BY 50 START 1;

DROP SEQUENCE IF EXISTS "visit_id_seq";
CREATE SEQUENCE "visit_id_seq" INCREMENT BY 50 START 1;

DROP TABLE IF EXISTS "users";
CREATE TABLE users (
    id BIGINT NOT NULL,
    name VARCHAR(50) NOT NULL,
    surname VARCHAR(50) NOT NULL,
    email VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(30) NOT NULL,
    phoneNumber INTEGER NOT NULL,
    typeOfAccount VARCHAR(5) NOT NULL,

    CONSTRAINT "users_pkey" PRIMARY KEY ("id")
);


DROP TABLE IF EXISTS "cars";
CREATE TABLE cars (
    id BIGINT NOT NULL,
    brand VARCHAR(20) NOT NULL,
    vehicleModel VARCHAR(10) NOT NULL,
    generation VARCHAR(10) NOT NULL,
    vin VARCHAR(17) NOT NULL,
    price FLOAT NOT NULL,
    yearOfManufacture INT NOT NULL,
    fuelType VARCHAR(10) NOT NULL,
    description VARCHAR(2048),
    mileage INT NOT NULL,
    capacity INT NOT NULL,
    power INT NOT NULL,
    gearbox VARCHAR(30) NOT NULL,
    bodyType VARCHAR(20) NOT NULL,
    numberOfDoors INT NOT NULL,
    numberOfSeats INT NOT NULL,
    drive VARCHAR(20) NOT NULL,

    CONSTRAINT "cars_pkey" PRIMARY KEY ("id")
);

DROP TABLE IF EXISTS "visits";
CREATE TABLE visits (
    id BIGINT NOT NULL,
    date TIMESTAMP NOT NULL,
    user_id BIGINT NOT NULL,
    car_id BIGINT NOT NULL,

    CONSTRAINT fk_user FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE,
    CONSTRAINT fk_car FOREIGN KEY (car_id) REFERENCES cars(id) ON DELETE CASCADE,
    CONSTRAINT "visits_pkey" PRIMARY KEY ("id")
);