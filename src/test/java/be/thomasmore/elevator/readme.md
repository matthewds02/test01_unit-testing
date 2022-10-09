In een hotel zijn niet alle verdiepingen toegelaten voor alle gebruikers. Enkel de lobby op verdieping 0 is voor iedereen toegankelijk.  
Een gebruiker identificeert zich aan de lift door zijn badge te scannen.
Als deze gebruiker niet naar een verdieping mag gaan dan wordt de knop voor deze verdieping inactief gemaakt.

Maak hiervoor een klasse _Elevator_.
Je maakt een object van deze klasse met één parameter:
* _badge_
  * een _String_
  * als er geen badge gescanned wordt is dit _null_

De badge geeft aan wat de mogelijkheden zijn in de lift.
* Een gebruiker zonder badge mag de lift niet gebruiken. 
* De knop voor de huidige verdieping is nooit actief.
* Een gebruiker met badge mag altijd naar verdieping 0 (lobby) en 10 (restaurant).
* Een badge met een kamernummer: deze gebruiker mag naar verdieping 0, de verdieping van zijn eigen kamer, en naar het restaurant
  * dus bvb: _badge "405"_ heeft toegang tot 0, 4 en 10
  * Er zijn enkel kamers op de verdiepingen 1 tot 9.
* Een badge voor personeel (_"S"_ van _STAFF_) heeft toegang tot alle verdiepingen

Maak in de klasse _Elevator_ een functie _activeButtons_.
Deze heeft één parameter.
* _currentLevel_
  * een getal
  * dit is een getal tussen -2 en 10.
De functie _activeButtons_ geeft een array van getallen terug.   
Deze getallen zijn de knoppen die actief zijn in de lift.

Als een gebruiker op een verdieping is waar hij niet mag zijn dan moet er een alarm afgaan. Het alarm gaat af als de functie _activeButtons_ een **null-array** teruggeeft. Dit heeft dus een andere betekenis dan een lege array.

Je moet niet testen of de _badge_ en het _currentLevel_ correct zijn.   
Het is dus niet belangrijk wat er gebeurt als een ongeldige _badge_ of een ongeldig _currentLevel_ meegegeven worden.
