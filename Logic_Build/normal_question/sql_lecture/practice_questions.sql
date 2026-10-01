-- DROP TABLE IF EXISTS food_orders;

-- CREATE TABLE food_orders (
--     order_id SERIAL PRIMARY KEY,
--     customer_name VARCHAR(50) NOT NULL,
--     city VARCHAR(50),
--     restaurant VARCHAR(50),
--     cuisine VARCHAR(30),
--     item VARCHAR(60),
--     quantity INT,
--     price_per_item DECIMAL(8, 2),
--     delivery_fee DECIMAL(6, 2),
--     rating INT CHECK (rating BETWEEN 1 AND 5), -- NULL if not rated
--     order_status VARCHAR(20), -- delivered, cancelled, pending
--     payment_mode VARCHAR(20), -- UPI, Card, Cash
--     order_date DATE
-- );

-- INSERT INTO food_orders (customer_name, city, restaurant, cuisine, item, quantity, price_per_item, delivery_fee, rating, order_status, payment_mode, order_date) VALUES
-- ('Aarav',  'Pune',      'Burger Singh',      'Fast Food',    'Veg Burger',          2, 120.00, 30.00, 4,    'delivered', 'UPI',  '2024-01-05'),
-- ('Diya',   'Mumbai',    'Behrouz Biryani',   'Mughlai',      'Chicken Biryani',     1, 350.00, 40.00, 5,    'delivered', 'Card', '2024-01-05'),
-- ('Rohan',  'Delhi',     'Haldiram',          'Snacks',       'Raj Kachori',         3,  90.00, 20.00, NULL, 'cancelled', 'UPI',  '2024-01-06'),
-- ('Sneha',  'Pune',      'Pizza Hub',         'Italian',      'Margherita Pizza',    1, 299.00, 35.00, 4,    'delivered', 'Cash', '2024-01-06'),
-- ('Karan',  'Bangalore', 'Meghana Foods',     'South Indian', 'Hyderabadi Biryani',  2, 320.00, 45.00, 5,    'delivered', 'Card', '2024-01-07'),
-- ('Isha',   'Mumbai',    'Vada Pav Junction', 'Snacks',       'Vada Pav',            5,  20.00, 15.00, 3,    'delivered', 'UPI',  '2024-01-07'),
-- ('Vikram', 'Delhi',     'Pizza Hub',         'Italian',      'Farmhouse Pizza',     2, 399.00, 50.00, NULL, 'pending',   'Card', '2024-01-08'),
-- ('Meera',  'Bangalore', 'Dosa Corner',       'South Indian', 'Masala Dosa',         3,  80.00, 25.00, 4,    'delivered', 'UPI',  '2024-01-08'),
-- ('Aditya', 'Pune',      'Behrouz Biryani',   'Mughlai',      'Paneer Biryani',      1, 280.00, 30.00, 2,    'delivered', 'Cash', '2024-01-09'),
-- ('Neha',   'Mumbai',    'Burger Singh',      'Fast Food',    'Chicken Burger',      2, 150.00, 35.00, 4,    'delivered', 'Card', '2024-01-09'),
-- ('Rahul',  'Delhi',     'Haldiram',          'Snacks',       'Chole Bhature',       2, 110.00, 20.00, 5,    'delivered', 'UPI',  '2024-01-10'),
-- ('Pooja',  'Bangalore', 'Pizza Hub',         'Italian',      'Pasta Alfredo',       1, 260.00, 40.00, NULL, 'cancelled', 'Card', '2024-01-10'),
-- ('Sahil',  'Pune',      'Dosa Corner',       'South Indian', 'Idli Sambar',         4,  50.00, 25.00, 3,    'delivered', 'Cash', '2024-01-11'),
-- ('Tanvi',  'Mumbai',    'Behrouz Biryani',   'Mughlai',      'Mutton Biryani',      1, 420.00, 45.00, 5,    'delivered', 'UPI',  '2024-01-11'),
-- ('Manish', 'Delhi',     'Burger Singh',      'Fast Food',    'Aloo Tikki Burger',   3,  99.00, 30.00, 3,    'delivered', 'Cash', '2024-01-12'),
-- ('Kavya',  'Bangalore', 'Meghana Foods',     'South Indian', 'Chicken 65',          1, 240.00, 45.00, 4,    'delivered', 'UPI',  '2024-01-12'),
-- ('Yash',   'Pune',      'Vada Pav Junction', 'Snacks',       'Misal Pav',           2,  70.00, 15.00, NULL, 'pending',   'UPI',  '2024-01-13'),
-- ('Anjali', 'Mumbai',    'Pizza Hub',         'Italian',      'Cheese Burst Pizza',  2, 449.00, 50.00, 5,    'delivered', 'Card', '2024-01-13'),
-- ('Dev',    'Delhi',     'Behrouz Biryani',   'Mughlai',      'Chicken Biryani',     2, 350.00, 40.00, 4,    'delivered', 'UPI',  '2024-01-14'),
-- ('Riya',   'Pune',      'Haldiram',          'Snacks',       'Pav Bhaji',           1, 130.00, 20.00, 2,    'delivered', 'Cash', '2024-01-14');


-- Part 1: SELECT and WHERE (1-10)
-- Show customer_name, item, and order_status for all orders.
SELECT * FROM food_orders

-- Find all orders placed from 'Pune'.
SELECT * FROM food_orders where city = 'Pune';

-- Find all orders where payment_mode is 'Cash'.
SELECT * FROM food_orders where payment_mode ='Cash';

-- Find orders where quantity is 3 or more.
SELECT * FROM food_orders WHERE quantity >= 3; 

-- Find all orders that are not delivered.
SELECT * FROM food_orders where order_status ='pending';

-- Find orders where price_per_item is between 100 and 300.
SELECT * FROM food_orders WHERE price_per_item BETWEEN 100 AND 300;

-- Find all orders whose item contains the word 'Biryani' (use LIKE).
SELECT * FROM food_orders WHERE item LIKE '%Biryani%';

-- Find orders from 'Delhi' or 'Mumbai' using IN.
SELECT * FROM food_orders WHERE city IN ('Delhi','Mumbai');

-- Find orders that have not been rated yet.
SELECT * FROM food_orders WHERE rating IS NULL;

-- Find delivered orders from 'Pune' paid by 'UPI'.
SELECT * FROM food_orders WHERE city ='Pune' AND payment_mode = 'UPI';
