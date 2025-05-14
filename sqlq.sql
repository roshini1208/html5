-- Create owner table
CREATE TABLE owners (
    owner_id INT PRIMARY KEY AUTO_INCREMENT,
    owner_name VARCHAR(100),
    email VARCHAR(100)
);

-- Create hostel table
CREATE TABLE hostels (
    hostel_id INT PRIMARY KEY AUTO_INCREMENT,
    hostel_name VARCHAR(100),
    location VARCHAR(100),
    rooms_available INT,
    owner_id INT,
    FOREIGN KEY (owner_id) REFERENCES owners(owner_id)
);

-- Insert sample owners
INSERT INTO owners (owner_name, email) VALUES
('Ravi Kumar', 'ravi@example.com'),
('Anita Sharma', 'anita@example.com');

-- Insert sample hostels
INSERT INTO hostels (hostel_name, location, rooms_available, owner_id) VALUES
('Green Stay Hostel', 'Coimbatore', 12, 1),
('Comfort Nest PG', 'Dharmapuri', 5, 2),
('Bright Living', 'Coimbatore', 8, 1);

-- Select all hostels
SELECT * FROM hostels;

-- Join hostels with owners
SELECT h.hostel_name, h.location, h.rooms_available, o.owner_name
FROM hostels h
JOIN owners o ON h.owner_id = o.owner_id;

-- Filter hostels by location
SELECT * FROM hostels WHERE location = 'Coimbatore';
