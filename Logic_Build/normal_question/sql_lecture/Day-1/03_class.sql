-- CREATE TABLE canteen_menu (
--     item_id SERIAL PRIMARY KEY,
--     item_name VARCHAR(100),
--     category VARCHAR(50), -- Snacks, Beverages, Meals
--     price INT,
--     is_available BOOLEAN DEFAULT TRUE
-- );

-- INSERT INTO canteen_menu 
-- (item_name, category, price)
-- VALUES
-- ('Masala Chai', 'Beverages', 10),
-- ('Samosa', 'Snacks', 12),
-- ('Rajma Chawal', 'Meals', 60),
-- ('Maggi', 'Snacks', 25),
-- ('Ice Tea', 'Beverages', 40);


-- DML :- Data Manupalating Language

-- DROP TABLE canteen_menu

-- SELECT * FROM canteen_menu

-- UPDATE canteen_menu
-- set price = 50
-- where item_name = 'Maggi'

-- UPDATE canteen_menu
-- SET price = price - 5
-- WHERE category = 'Beverages'

SELECT * FROM canteen_menu


DELETE FROM canteen_menu
WHERE category = 'Beverages'