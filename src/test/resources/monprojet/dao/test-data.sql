-- Initialisation spécifiques pour un jeu de test
INSERT INTO Country(code, name) VALUES
    ('IT', 'Italie');
INSERT INTO city(name,population,country_id) values
('Montpellier',22,SELECT id FROM country WHERE code= 'FR'),
('Paris',1,SELECT id FROM country WHERE code ='FR' );