[comment]: <> (```diff)
[comment]: <> (@@ English version below @@)
[comment]: <> (```)
# Gra planszowa "Chińczyk"
Użyta biblioteka GUI - JavaFX <br>
Autor - Piotr Łęcicki
## Menu główne
![Menu with loadbutton](https://user-images.githubusercontent.com/84147482/172002735-45e584ca-6772-49c4-83a7-ce9a6adce474.png) <br>
&nbsp;&nbsp;&nbsp;&nbsp;Po uruchomieniu programu komendą ```./gradlew run``` zostaje wyświetlone menu główne umożliwiające ustawienie, <br>
którymi pionkami będzie sterował gracz, a którymi komputer. Po zaznaczeniu kolorów i kliknięciu w przycisk "NEW GAME" <br>
rozpoczyna się rozgrywka. <br>
&nbsp;&nbsp;&nbsp;&nbsp;Program umożliwia wczytanie poprzedniej rozgrywki poprzez wciśnięcie przycisku "LOAD GAME". Zapis oraz odczyt stanu<br>
rozgrywki odbywa się za pośrednictwem pliku tekstowego zawartego w projekcie.
### Dezaktywacja przycisku wczytania gry
![Menu without loadbutton](https://user-images.githubusercontent.com/84147482/172004561-f4719e7a-8e69-431f-8046-0353ae7f76c4.png) <br>
&nbsp;&nbsp;&nbsp;&nbsp;W przypadku, gdy plik tekstowy nie zawiera zapisu gry, wtedy przycisk jest dezaktywowany i jest możliwość<br>
tylko rozpoczęcia rozgrywki od początku. Dzieje się tak, gdy gra się pierwszy raz lub poprzednia rozgrywka została rozegrana do końca<br>
i nie ma czego wczytać.
### Wymóg zaznaczenia minimum jednego koloru
![image](https://user-images.githubusercontent.com/84147482/172005568-9e897eea-3f0c-49e9-b298-76b4682f48d2.png) <br>
&nbsp;&nbsp;&nbsp;&nbsp;Program uniemożliwia pominięcie kroku wyboru minimum jednego koloru pionków sterowanych przez gracz. W przypadku, gdy nie <br>
zostanie zaznaczony żaden kolor i gracz kliknie przycisk "NEW GAME", wtedy wyświetli się komunikat proszący o zaznaczenie <br>
jednej lub więcej opcji. Ta reguła nie dotyczy wczytywania zapisanej gry, ponieważ wczytane z pliku zostają również dane, <br>
którymi pionkami steruje gracz, a którymi komputer.
