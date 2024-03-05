package org.Hamm.model;

public enum Province {
    A_Coruña("A Coruña", CCAA.Galicia),
    Álava("Álava", CCAA.País_Vasco),
    Albacete("Albacete", CCAA.Castilla_y_Léon),
    Alicante("Alicante", CCAA.Comunitat_Valenciana),
    Almería("Almería", CCAA.Andalucía),
    Asturias("Asturias", CCAA.Asturias),
    Ávila("Ávila", CCAA.Castilla_y_Léon),
    Badajoz("Badajoz", CCAA.Extremadura),
    Baleares("Baleares", CCAA.Baleares),
    Barcelona("Barcelona", CCAA.Cataluña),
    Burgos("Burgos", CCAA.Castilla_y_Léon),
    Cáceres("Cáceres", CCAA.Extremadura),
    Cádiz("Cádiz", CCAA.Andalucía),
    Cantabria("Cantabria", CCAA.Cantabria),
    Castellón("Castellón", CCAA.Comunitat_Valenciana),
    Ciudad_Real("Ciudad Real", CCAA.Castilla_la_Mancha),
    Córdoba("Córdoba", CCAA.Andalucía),
    Cuenca("Cuenca", CCAA.Castilla_la_Mancha),
    Girona("Girona", CCAA.Cataluña),
    Granada("Granada", CCAA.Andalucía),
    Guadalajara("Guadalajara", CCAA.Castilla_la_Mancha),
    Gipuzkoa("Gipuzkoa", CCAA.País_Vasco),
    Huelva("Huelva", CCAA.Andalucía),
    Huesca("Huesca", CCAA.Aragón),
    Jaén("Jaén", CCAA.Andalucía),
    La_Rioja("La Rioja", CCAA.Rioja),
    Las_Palmas("Las Palmas", CCAA.Canarias),
    León("León", CCAA.Castilla_y_Léon),
    Lérida("Lérida", CCAA.Cataluña),
    Lugo("Lugo", CCAA.Galicia),
    Madrid("Madrid", CCAA.Madrid),
    Mãlaga("Málaga", CCAA.Andalucía),
    Murcia("Murcia", CCAA.Murcia),
    Navarra("Navarra", CCAA.Navarra),
    Ourense("Ourense", CCAA.Galicia),
    Palencia("Palencia", CCAA.Castilla_y_Léon),
    Pontevedra("Pontevedra", CCAA.Galicia),
    Salamanca("Salamanca", CCAA.Castilla_y_Léon),
    Segovia("Segovia", CCAA.Castilla_y_Léon),
    Sevilla("Sevilla", CCAA.Andalucía),
    Soria("Soria", CCAA.Castilla_y_Léon),
    Tarragona("Tarragona", CCAA.Cataluña),
    Santa_Cruz_de_Tenerife("Santa Cruz de Tenerife", CCAA.Canarias),
    Teruel("Teruel", CCAA.Aragón),
    Toledo("Toledo", CCAA.Castilla_la_Mancha),
    Valencia("Valencia", CCAA.Comunitat_Valenciana),
    Valladolid("Valladolid", CCAA.Castilla_y_Léon),
    Vizcaya("Vizcaya", CCAA.País_Vasco),
    Zamora("Zamora", CCAA.Castilla_y_Léon),
    Zaragoza("Zaragoza", CCAA.Aragón);

    private String name;

    Province(String name) {
        this.name = name;
    }

    Province(String s, CCAA ccaa) {
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
