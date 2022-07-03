


INSERT INTO KORISNIK (id,  koisnickoIme, lozinka, ime, prezime, uloga, datumRodjenja, pol) VALUES
(0L, 'admin', 'admin', 'Amy', 'Smith', 'ADMIN', '12/20/1996', 'Female', true),
(1L, 'kupac', 'kupac', 'John', 'Haley', 'KUPAC', '12/20/1990', 'Male', true),
(2L, 'menadzer', 'menadzer', 'Blake', 'Evans', 'ADMIN', '12/30/1996', 'Female', true),
(3L, 'dostavljac', 'dostavljac', 'Bella', 'Miller', 'ADMIN', '12/20/1996', 'Female', true);

INSERT INTO ARTIKAL(id, naziv, tipHrane, cijena, kolicina, opis, restoran) VALUES
	(00L, 'burger', Jelo, 500, 2, 'Burger sa 100% junecim mesom i cedar sirom', americki, true),
	(11L, 'pica', Jelo, 900, 2, 'Madjarica sa kulenom', italijanski, true),
	(22L, 'kroasan', Jelo, 230, 2, Kroasan sa marmeladom, francuski, true);


