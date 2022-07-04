


INSERT INTO KORISNIK (id,  koisnickoIme, lozinka, ime, prezime, uloga, datumRodjenja, pol) VALUES
(0, 'admin', 'admin', 'Amy', 'Smith', 'ADMIN', '12/20/1996', 'Female'),
(1, 'kupac', 'kupac', 'John', 'Haley', 'KUPAC', '12/20/1990', 'Male', true),
(2, 'menadzer', 'menadzer', 'Blake', 'Evans', 'ADMIN', '12/30/1996', 'Female', true),
(3, 'dostavljac', 'dostavljac', 'Bella', 'Miller', 'ADMIN', '12/20/1996', 'Female', true);

INSERT INTO ARTIKAL(id, naziv, tipHrane, cijena, kolicina, opis, restoran) VALUES
	(00, 'burger', Jelo, 500, 2, 'Burger sa 100% junecim mesom i cedar sirom', americki),
	(11, 'pica', Jelo, 900, 2, 'Madjarica sa kulenom', italijanski),
	(22, 'kroasan', Jelo, 230, 2, 'Kroasan sa marmeladom', francuski);

INSERT INTO RESTORAN(id, naziv, tipHrane, cijena, kolicina, opis, restoran) VALUES
	(00, 'burger', Jelo, 500, 2, 'Burger sa 100% junecim mesom i cedar sirom', americki),

INSERT INTO MENADZER(id) SELECT ID FROM KORISNIK WHERE uloga = 'MENADZER';
UPDATE MENADZER SET restoranid = 000;


