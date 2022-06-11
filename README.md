```diff
@@ English version below @@
```
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
## Testy jednostkowe
![image](https://user-images.githubusercontent.com/84147482/172048239-c30a71fe-0716-43f7-8947-301a5c45b36c.png) ![image](https://user-images.githubusercontent.com/84147482/172048226-654133e4-132d-4ccb-9651-8e756292e91e.png) <br>
&nbsp;&nbsp;&nbsp;&nbsp;Projekt zawiera klasy z napisanymi testami jednostkowymi, które sprawdzają poprawność działania projektu podczas danej wykonanej operacji przez użytkownika. <br>
### Zrealizowane testy jednostkowe
- Początek gry (36 testów)
  - Czy pionki są nieruchowe, gdy wyrzucono mniej niż 6
  - Czy można wykonać ruch po wyrzuceniu 6
  - Czy można wykonać ruch tylko podczas swojej kolejki
  - Czy można wykonać ruch przed rzutem kostką
  - Czy pionki zajmują właściwą pozycję po pierwszym ruchu
- Przebieg gry (115 testów)
  - Czy losowane wartości za pomocą kości są z przedziału od 1 do 6
  - Czy pionki zajmują właściwe pozycje po wyrzuceniu danej liczby na kości
  - Czy pionki wracają na pozycje startowe po zbiciu przez inne pionki
- Koniec gry (25 testów)
  - Czy pionki zajmują właściwe pozycje po dotarciu do końca
  - Czy ranking końcowy wyświetla się prawidłowo
- Odczyt stanu gry z pliku save.txt (9 testów)
  - Czy informacje zawarte w pliku zapisu są prawidłowo odczytywane

# Ludo Game
Used GUI library - JavaFX <br>
Author - Piotr Łęcicki
## Menu
![Menu with loadbutton](https://user-images.githubusercontent.com/84147482/172002735-45e584ca-6772-49c4-83a7-ce9a6adce474.png) <br>
&nbsp;&nbsp;&nbsp;&nbsp;After starting the program using command ```./gradlew run``` (System Windows) the main menu is displayed for setting,
which pawns will be controlled by the player, and which by the computer. After selecting the colors and clicking the "NEW GAME" button, the game starts. <br>
&nbsp;&nbsp;&nbsp;&nbsp;The program allows you to load the previous game by pressing the "LOAD GAME" button. Saving and reading a state of
gameplay is done via the text file ``` save.txt ``` included in the project.
### Deactivating the load game button
![Menu without loadbutton](https://user-images.githubusercontent.com/84147482/172004561-f4719e7a-8e69-431f-8046-0353ae7f76c4.png) <br>
&nbsp;&nbsp;&nbsp;&nbsp;If the text file does not contain a game save, then the button is disabled and it is possible
only start the game from the beginning. This happens when the game is played for the first time or the previous game has been played through to the end
and there is nothing to load.
### The requirement to mark at least one color
![image](https://user-images.githubusercontent.com/84147482/172005568-9e897eea-3f0c-49e9-b298-76b4682f48d2.png) <br>
&nbsp;&nbsp;&nbsp;&nbsp;The program makes it impossible to skip the step of selecting at least one color of pawns controlled by player. In other case when
no color will be selected and the player clicks the "NEW GAME" button, then a message will be displayed asking to select
one or more options. This rule does not apply to loading a saved game, because datas, which pawns are controlled by the player and which by the computer are also loaded from the file.
## Game
![During game](https://user-images.githubusercontent.com/84147482/172011536-b53c97cb-a4dd-470c-b709-fec5d7f34302.png) <br>
&nbsp;&nbsp;&nbsp;&nbsp;The game consists in reaching the finish line with all pawns of your color before other players do it. After throwing the number 6, players may move from the starting fields one of the four pawns on the starting fields. After a pawn travels one full circle, it takes place on one of the five end fields.
### Numbering fields on the board
![numeration correct size](https://user-images.githubusercontent.com/84147482/172013630-73efe307-27c5-4179-b934-7b1e12e8a244.png) <br>
&nbsp;&nbsp;&nbsp;&nbsp;Every field visible on the board contains a unique index number. These numbers are not visible during the game. These numbers play a key role in the source code, which allows you to define in detail the positions of the pawns during the game.
### Capturing pawns
![Capturing part 1](https://user-images.githubusercontent.com/84147482/172014185-25a4f217-d9e2-4ea9-a477-bb380d0243cd.png) ![Capturing part 2](https://user-images.githubusercontent.com/84147482/172014230-a7576d4b-ed64-4237-bcb2-44d5c351253a.png) <br>
&nbsp;&nbsp;&nbsp;&nbsp;The game allows you to capture pieces of different colors. The captured pawn returns to the starting position, while the pawn that captured takes the position on which the captured player was. It is not possible to capture a pawn belonging to your own team, e.g. a red pawn cannot capture a second red pawn, in this situation both pawns are standing on the same field.
### Control panel
![control panel](https://user-images.githubusercontent.com/84147482/172015813-c2f45fb3-fc94-44be-8d13-7ee9486faf4a.png) <br>
&nbsp;&nbsp;&nbsp;&nbsp;The control panel shows the mechanism of throwing the dice with the button. After a given player draws a number, the button is blocked, which makes it impossible for the player to re-throw before making a move with a pawn. Additionally, there are two signs informing the player what to do and whose turn is. The attached picture shows the yellow player's turn, who has already rolled the dice and is currently choosing a pawn to move.
### End of the game
![final ranking](https://user-images.githubusercontent.com/84147482/172015449-bd918a49-9371-4497-af01-52d289b5d213.png) <br>
&nbsp;&nbsp;&nbsp;&nbsp;When all the pieces have taken their final positions, the final ranking is displayed and informing you which color took which position. 
## Save
Sample content of save.txt file with description of consecutive numbers
```
1 - Is there any saved game (enables / disables the "LOAD GAME" button)
0 - Red pawn position no. 1
19 - Red pawn position no. 2
26 - Red pawn position no. 3
29 - Red pawn position no. 4
63 - Green pawn position no. 1
5 - Green pawn position no. 2
6 - Green pawn position no. 3
7 - Green pawn position no. 4
8 - Yellow pawn position no. 1
61 - Yellow pawn position no. 2
10 - Yellow pawn position no. 3
11 - Yellow pawn position no. 4
21 - Blue pawn position no. 1
13 - Blue pawn position no. 2
14 - Blue pawn position no. 3
15 - Blue pawn position no. 4
3 - Cube condition, last number rolled
3 - Number of the player whose turn it is (Sets the appropriate inscription informing about it)
2 - Is the dice button active
3 - Number of the player whose turn it is (Sets the value of the class control field)
1 - Are the red pawns controlled by the player or the computer
0 - Are the green pawns controlled by the player or the computer
1 - Are the yellow pawns controlled by the player or the computer
0 - Are the blue pawns controlled by the player or the computer
0 - Has a dice already been rolled and now the player chooses a pawn to move
```
&nbsp;&nbsp;&nbsp;&nbsp;The program allows you to save the state of an unfinished game. The data is saved to the file when the game is turned off by clicking the "X" button in the upper right corner of the window during the game. The game save is deleted after the game is over and the game is turned off. The game may be overwritten by a new game that has been just started.
## Unit tests
![image](https://user-images.githubusercontent.com/84147482/172048239-c30a71fe-0716-43f7-8947-301a5c45b36c.png) ![image](https://user-images.githubusercontent.com/84147482/172048226-654133e4-132d-4ccb-9651-8e756292e91e.png) <br>
&nbsp;&nbsp;&nbsp;&nbsp;The project contains classes with written unit tests that verify the correction of operations of the project during playing it by a user <br>
### Realized unit tests
- The beginning of the game (36 tests)
  - Are the pieces unmoved when less than 6 has been thrown
  - Is it possible to make a move after rolling a 6
  - Can you only make a move during your turn
  - Is it possible to make a move before rolling the dice
  - Are the pawns in the correct positions after first move
- The course of the game (115 tests)
  - Are the values randomly selected with the dice between 1 and 6
  - Are the pawns moving in the correct positions after rolling a number on the dice
  - Do the pawns return to the starting positions after being captured by other pawns
- Game over (25 tests)
  - Are the pawns in the right positions after reaching the end
  - Is the final ranking displayed correctly
- Reading the game state from save.txt (9 tests)
  - Are the informations in the save file read correctly
