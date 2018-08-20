
**Chuck Norris**

**Objectif**

Le binaire avec des 0 et des 1 c'est bien. Mais le binaire avec que des 0, ou presque, c'est encore mieux. A l'origine, c'est un concept inventé par Chuck Norris pour envoyer des messages dits unaires.

Ecrivez un programme qui, à partir d'un message en entrée, affiche le message codé façon Chuck Norris en sortie.
  Règles

Voici le principe d'encodage :

    Le message en entrée est constitué de caractères ASCII (7 bits)
    Le message encodé en sortie est constitué de blocs de 0
    Un bloc est séparé d'un autre bloc par un espace
    Deux blocs consécutifs servent à produire une série de bits de même valeur (que des 1 ou que des 0) :
    - Premier bloc : il vaut toujours 0 ou 00. S'il vaut 0 la série contient des 1, sinon elle contient des 0
    - Deuxième bloc : le nombre de 0 dans ce bloc correspond au nombre de bits dans la série

Exemple:

Prenons un exemple simple avec un message constitué d'un seul caractère : C majuscule. C en binaire vaut 1000011 ce qui donne avec la technique de Chuck Norris :

    0 0 (la première série composée d'un seul 1)
    00 0000 (la deuxième série composée de quatre 0)
    0 00 (la troisième série composée de deux 1)

C vaut donc : 0 0 00 0000 0 00
 

Deuxième exemple, nous voulons encoder le message CC (soit les 14 bits 10000111000011) :

    0 0 (un seul 1)
    00 0000 (quatre 0)
    0 000 (trois 1)
    00 0000 (quatre 0)
    0 00 (deux 1)
    
CC vaut donc : 0 0 00 0000 0 000 00 0000 0 00

**_Pour bien commencer_**

Afin de commencer facilement, le projet comprend déjà la classe main (_ChuckNorrisJavaKata_) et la classe _ChuckNorris_ qui servira de classe principale.
On y trouve les méthodes permettant la transformation d'un caractère en binaire. Le but est donc ici de se focaliser uniquement sur la transformation binaire vers unaire.

Le constructeur _ChuckNorris_ prend deux arguments :
    - la chaîne à décoder en unaire
    - un nombre _nbBytes_ qui permet de limiter le nombre de byte que l'on souhaite obtenir.
    
Par exemple, la chaîne "C" avec _nbByte_ à 1 donnera en binaire 1 alors qu'avec nbByte à 7 cela donnera 1000011

Ce paramètre à pour seul but de pouvoir tester unitairement des cas simple impossible avec des codes ascii complet
On propose donc d'entamer les tests avec les paramètres suivant :

_Test 1_ : 

    message => 1
    nbBytes => 1
    expected => 00 0

_Test 2_ : 

    message => C
    nbBytes => 1
    expected => 0 0

**_Entrées du jeu_**
_Entrée_

    Le message composé de N caractères ASCII (sans retour chariot)

_Sortie_
    
    Le message encodé en unaire

**_Exemple_**
_Entrée_

    C

_Sortie_

    0 0 00 0000 0 00


