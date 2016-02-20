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
