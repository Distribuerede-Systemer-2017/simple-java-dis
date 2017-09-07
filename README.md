## Et simpelt Java DIS

Dette DIS består af en Server og Client klasse, som kan sende simple tekst beskeder frem og tilbage til hinanden.

#### 1. Opgave - Hent repository
Hent dette repository og åbn i IntelliJ
1. Åbn din terminal eller git bash
2. Naviger hen til den mappe du ønsker projektet skal ligge i feks `cd /dis2017/exercises`
3. `git clone https://github.com/Distribuerede-Systemer-2017/simple-java-dis.git`
4. Åbn IntelliJ og lav nyt projekt (du skal ikke bruge nogle eksterne frameworks), men sørg for du kører Java 1.8 som SDK
5. Ved det sidste step (vælg placering) vælger du mappen der netop er blevet lavet i step 3.
6. Du er færdig!

#### 2. Opgave
Hvis IntelliJ brokker sig over en fejl i Server klassen, så har den fat i noget. På linje 36 bliver der refereret til en variable som ikke eksisterer.

Din opgave er at lave `stringResponse` med den besked som kommer fra klientet og gør alle bogstaver store, for til sidst at sende beskeden retur til klienten.


Når du har gjort dette kan du køre hhv. server og klient på følgende måde:

##### Kør serveren:
1. I mappen `/src` højreklik på Server
2. Klik på `Run'Server.main()'`

##### Kør klienten:
1. I mappen `/src` højreklik på Client
2. Klik på `Run'Client.main()'`