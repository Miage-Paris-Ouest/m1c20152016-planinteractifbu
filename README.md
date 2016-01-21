# Projet: Plan Interactif BU
<h1>Conception projet</h1>

<h2>Sujet : Plan interactif BU </h2>

<p>
Le but de notre projet est de concevoir et créer un plan interactif de la bibliothèque de l’université de Paris Ouest Nanterre la Défense. Ainsi, notre référent client devrait être « un groupe projet au sein du Service Commun de la Documentation », cependant pour ce cours, nous aurons un référent intermédiaire, qui sera notre enseignant, M. Rousseau.
</p>
<p>
Le cahier des charges de ce projet a pour contraintes le fait de concevoir ce plan pour une application web et/ou mobile. Nous avons choisi de le réaliser pour une application mobile. En effet, après réflexion, il nous a semblé logique que 
lorsque nous cherchons notre chemin ou quelque chose, nous avons plutôt tendance à le chercher sur notre téléphone. Par exemple, nous sommes à la bibliothèque et nous voulons aller dans une certaine section, il est plus pratique de sortir 
notre téléphone et de chercher la dite section et de suivre le plan avec notre téléphone, plutôt que de chercher un ordinateur dans la bibliothèque, regarder et retenir le plan, d’où notre décision de concevoir ce projet sur mobile.
</p>
<p>
Ainsi, nous allons devoir concevoir et réaliser ce projet sur Android Studio et donc en langage Java. Nous utiliserons également :
  <ul>
    <li>	GitHub pour la mise en commun de notre travail ;</li>
    <li>	Gradle pour l’organisation de notre code et l’automatisation des différentes phases de build du projet ;</li>
    <li>	Travis  et CoverAlls pour tester l’ensemble de l’application en temps réel.</li>
  </ul>
</p>
<p>
Afin de réaliser au mieux ce projet, il est important d’avoir certaines compétences, telles que la connaissance du langage Java et de l’environnement de développement Android Studio. Nous allons également devoir nous familiariser avec GitHub.
</p>
<p>
A la fin de notre projet, nous devrons avoir produit une version de notre application facile à déployer à partir de notre dépôt GitHub ainsi qu’une documentation de cette dernière destinée à notre référent afin qu’il puisse la maintenir.
</p>

<img src="https://raw.githubusercontent.com/Mohamed-MIAGE/UseCaseBU/master/Documents/img/UseCaseBU%20-%20Dark.png"/>

<p>
Nous avons décidé de simplifier l’interface graphique de l’application au maximum afin qu’elle soit performante (rapidité de chargement du plan et des résultats des recherches) et facile d’utilisation.
</p>
<p>
L’interface sera comme ci-dessous :
<br/>
<img src="https://raw.githubusercontent.com/Mohamed-MIAGE/UseCaseBU/master/Documents/img/vue_appli_base.png" />

<img src="https://raw.githubusercontent.com/Mohamed-MIAGE/UseCaseBU/master/Documents/img/vue_appli_recherche.png" />
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
                 <li>Des disciplines</li>
                 <li>Des sous-disciplines</li>
                 <li>Des racines de cotes</li>
            </ul>
        <li>Un bouton vers l'index</li>
    </ul>
</p>