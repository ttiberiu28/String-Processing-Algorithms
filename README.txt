Ordean Tiberiu-Vasilian 322CD

Arhiva aceasta contine urmatoarele fisiere: 'in', 'out', 'Makefile','README',
'Main.java','Levenshtein.java','BoyerMoore.java'.

1.) 'in' ->contine 3 fisiere,fiecare fiind denumit dupa numele algoritmului
implementat .
Pentru EditDistance(Levenshtein si LCS) am oferit 10 teste(la fel pentru fiecare), deoarece avand
in vedere ca singura diferenta dintre algoritmi este includerea/excluderea
conditiei pentru replacement, consider ca asa se observa cel mai bine
diferenta de functionabilitate dintre cei doi algoritmi.

Pentru BoyerMoore am oferit 10 teste diferite de cele pentru celilalti algoritmi.

2.) 'out' -> contine 3 fisiere de asemenea denumite dupa fiecare algoritm , unde
se vor scrie rezultatele .

3.) Clasele 'LCS', 'BoyerMoore', 'Levenshtein' contin algoritmii propriu zisi, implementati
dupa explicatiile oferite in etapa 1 in documentul PDF trimis . In aceste clase am definit
functii statice ca sa pot sa le apelez din main fara sa imi mai declar obiecte , dar si alte
functii auxiliare necesare in rezolvarea algoritmilor.

4.) In clasa 'Main' am facut citire din 'in' si afisarea in 'out', am apelat functiile.
Am decis,pentru simplitate sa fac parsarea pentru fiecare functie intr-un for separat.

5.)Makefileul -> regula 'make' compileaza deafult toate clasele, regula de 'make clean',
sterge fisierele compilate si toate outurile , iar 'make run' ruleaza main-ul.

6.) Observatii algoritmi:
a.)
Am pus comentarii in fiecare clasa unde am considerat necesar. De asemenea in etapa 1, in pdf-ul
trimis am explicat in detaliu fiecare pas pe care l-am parcurs pentru a implementa algoritmii.
b.)
Pentru Levenshtein si LCS se citesc din fisierul de 'in' in ordinea aceasta: 'string1','string2',
'length(string1)' , 'length(string2)' si se afiseaza in fisierul de 'out' numarul de operatii
necesare pentru a face string2 sa fie egal cu string1(operatiile sunt insertion,removal,replacement
pentru Levenshtein si insertion si removal pentru LCS)

Pentru BoyerMoore se citeste prima oara "string"(textul in care se cauta patternul), iar mai apoi
se citeste 'pattern'. Se va afisa pozitia unde se gaseste patternul(sau pozitiile unde se gaseste in
caz ca se gaseste de mai multe ori, sau nu se va afisa nimic in caz de nu se gaseste deloc).

7.)Compilator folosit
Am folosit Javac ,compilatorul principal inlcus in JDK . Acesta este scris in java si are licenta
publica GNU.
8.)Referinte:
https://www.geeksforgeeks.org/edit-distance-dp-5/
https://www.geeksforgeeks.org/boyer-moore-algorithm-for-pattern-searching/
https://www.cs.swarthmore.edu/~newhall/unixhelp/javamakefiles.html
https://medium.com/@ethannam/understanding-the-levenshtein-distance-equation-for-beginners-c4285a5604f0

