


INSERT INTO KORISNIK (id, datumRodjenja, ime, koisnickoIme, lozinka, ime, pol, prezime, uloga  ) VALUES
(0, 'admin', 'admin', 'Amy', 'Smith', 'ADMIN', '12/20/1996', 'Female'),
(1, 'kupac', 'kupac', 'John', 'Haley', 'KUPAC', '12/20/1990', 'Male'),
(2, 'menadzer', 'menadzer', 'Blake', 'Evans', 'ADMIN', '12/30/1996', 'Female'),
(3, 'dostavljac', 'dostavljac', 'Bella', 'Miller', 'ADMIN', '12/20/1996', 'Female');

INSERT INTO ARTIKAL(id, naziv, tipHrane, cijena, kolicina, opis, restoran) VALUES
	(00, 'burger', Jelo, 500, 2, 'Burger sa 100% junecim mesom i cedar sirom', americki),
	(11, 'pica', Jelo, 900, 2, 'Madjarica sa kulenom', italijanski),
	(22, 'kroasan', Jelo, 230, 2, 'Kroasan sa marmeladom', francuski),
	(33, 'fanta', Pice, 100, 5, 'sok', francuski);

INSERT INTO RESTORAN(id, naziv, tipRestorana, artikli, lokacija, porudzbine) VALUES
	(01, "Le Piaf", "francuski", "pasta", "Novi Sad", "porudzbina1"),
	(02, "Pizzeria Ciao", "italijanski", "pica", "Novi Sad", "porudzbina2"),

INSERT INTO MENADZER(id) SELECT ID FROM KORISNIK WHERE uloga = 'Menadzer';
UPDATE MENADZER SET restoranid = 000;


