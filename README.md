[comment]: <> (```diff)
[comment]: <> (@@ English version below @@)
[comment]: <> (```)
# Gra planszowa "Chińczyk"
Użyta biblioteka GUI - JavaFX <br>
Autor - Piotr Łęcicki
## Menu główne
![Menu with loadbutton](https://user-images.githubusercontent.com/84147482/172002735-45e584ca-6772-49c4-83a7-ce9a6adce474.png) <br>
&nbsp;&nbsp;&nbsp;&nbsp;Po uruchomieniu programu komendą ```./gradlew run``` (System Windows) zostaje wyświetlone menu główne umożliwiające ustawienie, 
którymi pionkami będzie sterował gracz, a którymi komputer. Po zaznaczeniu kolorów i kliknięciu w przycisk "NEW GAME" rozpoczyna się rozgrywka. <br>
&nbsp;&nbsp;&nbsp;&nbsp;Program umożliwia wczytanie poprzedniej rozgrywki poprzez wciśnięcie przycisku "LOAD GAME". Zapis oraz odczyt stanu 
rozgrywki odbywa się za pośrednictwem pliku tekstowego ```save.txt``` zawartego w projekcie.
### Dezaktywacja przycisku wczytania gry
![Menu without loadbutton](https://user-images.githubusercontent.com/84147482/172004561-f4719e7a-8e69-431f-8046-0353ae7f76c4.png) <br>
&nbsp;&nbsp;&nbsp;&nbsp;W przypadku, gdy plik tekstowy nie zawiera zapisu gry, wtedy przycisk jest dezaktywowany i jest możliwość 
tylko rozpoczęcia rozgrywki od początku. Dzieje się tak, gdy gra się pierwszy raz lub poprzednia rozgrywka została rozegrana do końca 
i nie ma czego wczytać.
### Wymóg zaznaczenia minimum jednego koloru
![image](https://user-images.githubusercontent.com/84147482/172005568-9e897eea-3f0c-49e9-b298-76b4682f48d2.png) <br>
&nbsp;&nbsp;&nbsp;&nbsp;Program uniemożliwia pominięcie kroku wyboru minimum jednego koloru pionków sterowanych przez gracza. W przypadku, gdy nie 
zostanie zaznaczony żaden kolor i gracz kliknie przycisk "NEW GAME", wtedy wyświetli się komunikat proszący o zaznaczenie 
jednej lub więcej opcji. Ta reguła nie dotyczy wczytywania zapisanej gry, ponieważ wczytane z pliku zostają również dane dotyczące, 
którymi pionkami steruje gracz, a którymi komputer.
## Rozgrywka
![During game](https://user-images.githubusercontent.com/84147482/172011536-b53c97cb-a4dd-470c-b709-fec5d7f34302.png) <br>
&nbsp;&nbsp;&nbsp;&nbsp;Gra polega na dotarciu wszystkimi pionkami danego koloru do mety zanim zrobią to pozostali gracze. Po wyrzuceniu liczby 6 gracze mogą wyprowadzić z pól startowych jeden z czterech pionków znajdujących się na polach startowych. Po przebyciu jednego pełnego okrążenia przez dany pionek zajmuje on miejsce na jednym z pięciu pól końcowych.
### Numeracja pól na planszy
![numeration correct size](https://user-images.githubusercontent.com/84147482/172013630-73efe307-27c5-4179-b934-7b1e12e8a244.png) <br>
&nbsp;&nbsp;&nbsp;&nbsp;Każde pole widoczne na planszy zawiera unikatowy numer indeksu. Podczas rozgrywki te numery nie są widoczne. Te numery odgrywają kluczową rolę w kodzie źródłowym, co pozwala szczegółowo zdefiniować pozycje pionków podczas rozgrywki.
### Zbijanie się wzajemne pionków
![Capturing part 1](https://user-images.githubusercontent.com/84147482/172014185-25a4f217-d9e2-4ea9-a477-bb380d0243cd.png) ![Capturing part 2](https://user-images.githubusercontent.com/84147482/172014230-a7576d4b-ed64-4237-bcb2-44d5c351253a.png) <br>
&nbsp;&nbsp;&nbsp;&nbsp;Rozgrywka umożliwia zbijanie się wzajemne pionków o różnych kolorach. Zbity pionek wraca na pozycję startową, notomiast pionek który zbijał zajmuje pozycję, na której znajdował się zbity gracz. Nie ma możliwości zbicia pionka należącego do własnej drużyny np. pionek czerwony nie może zbić drugiego pionka czerwonego, w tej sytuacji oba pionki stoją na tym samym polu.
### Panel sterowania
![control panel](https://user-images.githubusercontent.com/84147482/172015813-c2f45fb3-fc94-44be-8d13-7ee9486faf4a.png) <br>
&nbsp;&nbsp;&nbsp;&nbsp;Panel sterowania obrazuje mechanizm rzucania kostką do gry za pomocą przycisku. Po wylosowaniu liczby przez danego gracza następuje zablokowanie przycisku, co uniemożliwia wykonanie ponownego rzutu przez gracza, zanim nie wykona ruchu pionkiem. Dodatkowo widnieją dwa napisy informujące gracza, co ma zrobić oraz czyja jest kolejka. Na załączonym obrazku jest kolej gracza żółtego, który już rzucił kostką i aktualnie wybiera pionek, którym chce się poruszyć.
### Zakończenie rozgrywki
![final ranking](https://user-images.githubusercontent.com/84147482/172015449-bd918a49-9371-4497-af01-52d289b5d213.png) <br>
&nbsp;&nbsp;&nbsp;&nbsp;Gdy wszystkie pionki zajmą pozycje końcowe zostaje wyświetlony ranking końcowy informujący, który kolor zajął które miejsce. 
## Zapis gry
Przykładowa zawartość pliku save.txt wraz z opisem kolejnych liczb
```
1 - Czy jest jakaś gra zapisana (aktywuje/dezaktywuje przycisk "LOAD GAME")
0 - Pozycja czerownego pionka nr. 1
19 - Pozycja czerownego pionka nr. 2
26 - Pozycja czerownego pionka nr. 3
29 - Pozycja czerownego pionka nr. 4
63 - Pozycja zielonego pionka nr. 1
5 - Pozycja zielonego pionka nr. 2
6 - Pozycja zielonego pionka nr. 3
7 - Pozycja zielonego pionka nr. 4
8 - Pozycja żółtego pionka nr. 1
61 - Pozycja żółtego pionka nr. 2
10 - Pozycja żółtego pionka nr. 3
11 - Pozycja żółtego pionka nr. 4
21 - Pozycja niebieskiego pionka nr. 1
13 - Pozycja niebieskiego pionka nr. 2
14 - Pozycja niebieskiego pionka nr. 3
15 - Pozycja niebieskiego pionka nr. 4
3 - Stan kostki, wyrzucony ostatnio numer
3 - Numer gracza, którego jest kolej (Ustawia odpowiedni napis informujący o tym)
2 - Czy przycisk do rzucania kością jest aktywny
3 - Numer gracza, którego jest kolej (Ustawia wartość pola sterującego programem)
1 - Czy czerwonymi pionkami steruje gracz, czy komputer
0 - Czy zielonymi pionkami steruje gracz, czy komputer
1 - Czy żółtymi pionkami steruje gracz, czy komputer
0 - Czy niebieskimi pionkami steruje gracz, czy komputer
0 - Czy została już rzucona kość i teraz gracz wybiera pionek do ruchu
```
&nbsp;&nbsp;&nbsp;&nbsp;Program umożliwia zapisanie stanu niedokończonej gry. Zapis danych do pliku następuje podczas wyłączania gry klikając przycisk "X" znajdujący się w prawym górnym rogu okna podczas rozgrywki. Zapis gry usuwa się po zakończeniu rozgrywki i wyłączeniu jej. Gra może zostać nadpisana przez nową rozpoczętą rozgrywkę.


