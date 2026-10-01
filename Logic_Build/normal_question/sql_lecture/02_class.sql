-- CREATE TABLE ipl_players (
--     player_id SERIAL PRIMARY KEY,
--     name VARCHAR(100),
--     team VARCHAR(50),
--     role VARCHAR(50), -- Batsman, Bowler, All-Rounder
--     runs_scored INT,
--     wickets_taken INT,
--     auction_price_crores DECIMAL(5, 2)
-- );

-- ALTER TABLE ipl_players ADD COLUMN nickname VARCHAR(50);

-- INSERT INTO ipl_players (name, team, role, runs_scored, wickets_taken, auction_price_crores, nickname) VALUES
-- ('Virat Kohli', 'RCB', 'Batsman', 973, 0, 15.00, 'King Kohli'),
-- ('MS Dhoni', 'CSK', 'Wicketkeeper', 450, 0, 12.00, 'Thala'),
-- ('Jasprit Bumrah', 'Mumbai Indians', 'Bowler', 15, 27, 12.00, 'Jassi'),
-- ('Hardik Pandya', 'Mumbai Indians', 'All-Rounder', 400, 15, 15.00, 'Kung Fu Pandya'),
-- ('Sunil Narine', 'KKR', 'All-Rounder', 350, 20, 8.50, 'Carrom King'),
-- ('Rohit Sharma', 'Mumbai Indians', 'Batsman', 550, 0, 16.00, 'Hitman'),
-- ('Rashid Khan', 'Gujarat Titans', 'Bowler', 50, 19, 15.00, 'The Magician'),
-- ('Rinku Singh', 'KKR', 'Batsman', 475, 0, 0.55, 'The Spirit'),
-- ('Arjun Tendulkar', 'Mumbai Indians', 'Bowler', 10, 3, 0.30, 'Arjun'),
-- ('Kane Williamson', 'LSG', 'Batsman', 600, 0, 11.00, 'Kane Mama'),
-- ('Mystery Player', NULL, 'Batsman', 0, 0, 1.00, 'Mystery Man'); -- Unsold / No Team (NULL Demo)


-- SELECT * FROM ipl_players;


-- !Filters 

-- SELECT * FROM ipl_players where team = 'Mumbai Indians';

-- SELECT nickname, name , auction_price_crores FROM ipl_players where auction_price_crores >10 ;

-- Logical OPrater (AND, OR )

-- SELECT * FROM ipl_players WHERE wickets_taken >0 AND role = 'All-Rounder'

-- SELECT * FROM ipl_players where team ='CSK' OR team = 'RCB'

----- Patten Matching  LIKE:-   CASE Sensative    _ :- letter Position , char% :- anythigs will work after % 
--                     ILIKE :- no CASE Sensative                    
-- SELECT * FROM ipl_players WHERE name LIKE '__s%'


-- SELECT * FROM ipl_players where team IN ('KKR','Mumbai Indians','RCB','CSK')

-- SELECT * FROM ipl_players where auction_price_crores >=10 AND auction_price_crores<=20    
-- SELECT * FROM ipl_players where auction_price_crores BETWEEN 10 AND 20


-- Sorting
SELECT name ,auction_price_crores FROM ipl_players ORDER BY auction_price_crores DESC

