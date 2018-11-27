<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="FIN_TANT_QUE"/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="actif"/>
    <F2 F2para="" F2etat="inactif" F2defaut="" F2lignes=""/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param epaisseurPoint="2" arrondiAuto="vrai" totalAffichages="1000" nbDecimales="8" totalBoucles="5000000" maxBoucle="500000" epaisseurLigne="2"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="basse EST_DU_TYPE NOMBRE" code="1#NOMBRE#basse"/>
        <item algoitem="haute EST_DU_TYPE NOMBRE" code="1#NOMBRE#haute"/>
        <item algoitem="i EST_DU_TYPE NOMBRE" code="1#NOMBRE#i"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="AFFICHER &quot;valeur basse:&quot;" code="4#valeur basse:#0"/>
        <item algoitem="LIRE basse" code="2#basse#pasliste"/>
        <item algoitem="AFFICHER &quot;valeur haute:&quot;" code="4#valeur haute:#0"/>
        <item algoitem="LIRE haute" code="2#haute#pasliste"/>
        <item algoitem="i PREND_LA_VALEUR haute" code="5#i#haute#pasliste"/>
        <item algoitem="TANT_QUE (i&lt;haute) FAIRE" code="15#i&lt;haute">
            <item algoitem="DEBUT_TANT_QUE" code="16#debuttantque"/>
            <item algoitem="i PREND_LA_VALEUR i+1" code="5#i#i+1#pasliste"/>
            <item algoitem="SI (i%2==0) ALORS" code="6#i%2==0">
                <item algoitem="DEBUT_SI" code="7#debutsi"/>
                <item algoitem="AFFICHER i" code="3#i#0#pasliste"/>
                <item algoitem="FIN_SI" code="8#finsi"/>
            </item>
            <item algoitem="FIN_TANT_QUE" code="17#fintantque"/>
        </item>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
