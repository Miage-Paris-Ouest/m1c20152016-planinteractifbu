# Projet: Plan Interactif BU

[![Build Status](https://travis-ci.org/Miage-Paris-Ouest/m1c20152016-planinteractifbu.svg?branch=master)](https://travis-ci.org/Miage-Paris-Ouest/m1c20152016-planinteractifbu)
[![Coverage Status](https://coveralls.io/repos/github/Miage-Paris-Ouest/m1c20152016-planinteractifbu/badge.svg?branch=master)](https://coveralls.io/github/Miage-Paris-Ouest/m1c20152016-planinteractifbu?branch=master)

<h1>Conception projet</h1>

<h2>Sujet : Plan interactif BU </h2>

<p>
Le but de notre projet est de concevoir et créer un plan interactif de la bibliothèque de
l’université de Paris Ouest Nanterre la Défense. Ainsi, notre référent client devrait être « un
groupe projet au sein du Service Commun de la Documentation », cependant pour ce cours, nous aurons
 un référent intermédiaire, qui sera notre enseignant, M. Rousseau.
</p>
<p>
Le cahier des charges de ce projet a pour contraintes le fait de concevoir ce plan pour une
application web et/ou mobile. Nous avons choisi de le réaliser pour une application mobile.
Ainsi, nous allons réaliser ce projet en Android.
</p>
<p>
A la fin de notre projet, nous devrons avoir produit une version de notre application facile à
déployer à partir de notre dépôt GitHub ainsi qu’une documentation de cette dernière destinée à
notre référent afin qu’il puisse la maintenir.
</p>

Regroupement des documents à voir :
- <a href="https://github.com/Miage-Paris-Ouest/m1c20152016-planinteractifbu/blob/master/Documents/Prototypes.md">Le prototype de départ</a> 
- <a href="https://github.com/Miage-Paris-Ouest/m1c20152016-planinteractifbu/tree/master/Documents/Prototype">La vidéo du prototype de départ</a>
- <a href="https://github.com/Miage-Paris-Ouest/m1c20152016-planinteractifbu/blob/master/Documents/Contraintes">Les contraintes de l'application</a>
- <a href="https://github.com/Miage-Paris-Ouest/m1c20152016-planinteractifbu/blob/master/Documents/Tech.md">Les spécificités techniques</a>
- <a href="https://github.com/Miage-Paris-Ouest/m1c20152016-planinteractifbu/blob/master/Documents/Présentation.pdf">La présentation de fin de projet</a>
- Document Utilisateur :<A HREF="https://github.com/Miage-Paris-Ouest/m1c20152016-planinteractifbu/blob/master/Documents/Guide%20Utilisateur/Doc_util.docx?raw=true">Télécharger le manuel utilisateur</A> 
- Video de demonstration :<A HREF="https://github.com/Miage-Paris-Ouest/m1c20152016-planinteractifbu/blob/master/Documents/Guide%20Utilisateur/PlanInteractifBU.avi?raw=true">Télécharger la vidéo de démonstration</A>
- APK permettant le test de l'application aboutie: <A HREF="https://github.com/Miage-Paris-Ouest/m1c20152016-planinteractifbu/blob/master/Documents/PlanInteractifBU.apk?raw=true">Télécharger l'APK</A>
<p>

</p>

<img src="https://raw.githubusercontent.com/Mohamed-MIAGE/UseCaseBU/master/Documents/img/UseCaseBU%20-%20Dark.png"/>

<p>
Nous avons décidé de simplifier l’interface graphique de l’application au maximum afin qu’elle soit
performante (rapidité de chargement du plan et des résultats des recherches) et facile d’utilisation.
</p>
<p>
<h3>Les fonctionnalités à implémenter</h3>
Nous allons devoir implémenter différentes fonctionnalités :
    <ul>
        <li>Afficher le plan</li>
            <ul>
                <li>des étages</li>
                <li>des étagères par étage</li>
            </ul>
        <li>Afficher les listes déroulants du menu</ll>
            <ul>
                 <li>Des étages</li>
                 <li>Des disciplines et sous-disciplines</li>
                 <li>Des racines de cotes</li>
            </ul>
        <li>Un bouton vers l'index</li>
        <li>Au clic sur une discipline, une racine de côte ou sur une côte dans l'index:</li>
         <ul>
          <li>Les étages contenant au moins une étagère répondant au(x) critère(s) de recherche s'afficheront en surbrillance
              dans le menu déroulant des étages</li>
          <li>Les étagères contenant la discipline/racine de côte/côte s'affichent en surbrillance sur le plan</li>
         </ul>
    </ul>
</p>

<p>
Comme ressources, nous avons utilisé :<ul>
<li>Android Studio</li>
<li>GitHub (et GitHub Desktop)</li>
<li>Emulateur Android</li>
</ul>
</p>


<p>Afin de réaliser au mieux ce projet, nous avons utilisé pusieurs branches (de notre branche master) sous GitHub</p>
