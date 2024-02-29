package org.Hamm.model;

public enum Province {
    A_CORUÑA("A Coruña", CCAA.Galicia),
    ÁLAVA("Álava", CCAA.País_Vasco),
    ALBACETE("Albacete", CCAA.Castilla_y_Léon),
    ALICANTE("Alicante", CCAA.Comunitat_Valenciana),
    ALMERÍA("Almería", CCAA.Andalucía),
    ASTURIAS("Asturias", CCAA.Asturias),
    ÁVILA("Ávila", CCAA.Castilla_y_Léon),
    BADAJOZ("Badajoz", CCAA.Extremadura),
    BALEARES("Baleares", CCAA.Baleares),
    BARCELONA("Barcelona", CCAA.Cataluña),
    BURGOS("Burgos", CCAA.Castilla_y_Léon),
    CÁCERES("Cáceres", CCAA.Extremadura),
    CÁDIZ("Cádiz", CCAA.Andalucía),
    CANTABRIA("Cantabria", CCAA.Cantabria),
    CASTELLÓN("Castellón", CCAA.Comunitat_Valenciana),
    CIUDAD_REAL("Ciudad Real", CCAA.Castilla_la_Mancha),
    Córdoba("Córdoba", CCAA.Andalucía),
    CUENCA("Cuenca", CCAA.Castilla_la_Mancha),
    GIRONA("Girona", CCAA.Cataluña),
    GRANADA("Granada", CCAA.Andalucía),
    GUADALAJARA("Guadalajara", CCAA.Castilla_la_Mancha),
    GIPUZKOA("Gipuzkoa", CCAA.País_Vasco),
    HUELVA("Huelva", CCAA.Andalucía),
    HUESCA("Huesca", CCAA.Aragón),
    JAÉN("Jaén", CCAA.Andalucía),
    LA_RIOJA("La Rioja", CCAA.Rioja),
    LAS_PALMAS("Las Palmas", CCAA.Canarias),
    LEÓN("León", CCAA.Castilla_y_Léon),
    LÉRIDA("Lérida", CCAA.Cataluña),
    LUGO("Lugo", CCAA.Galicia),
    MADRID("Madrid", CCAA.Madrid),
    MÁLAGA("Málaga", CCAA.Andalucía),
    MURCIA("Murcia", CCAA.Murcia),
    NAVARRA("Navarra", CCAA.Navarra),
    OURENSE("Ourense", CCAA.Galicia),
    PALENCIA("Palencia", CCAA.Castilla_y_Léon),
    PONTEVEDRA("Pontevedra", CCAA.Galicia),
    SALAMANCA("Salamanca", CCAA.Castilla_y_Léon),
    SEGOVIA("Segovia", CCAA.Castilla_y_Léon),
    SEVILLA("Sevilla", CCAA.Andalucía),
    SORIA("Soria", CCAA.Castilla_y_Léon),
    TARRAGONA("Tarragona", CCAA.Cataluña),
    SANTA_CRUZ_DE_TENERIFE("Santa Cruz de Tenerife", CCAA.Canarias),
    TERUEL("Teruel", CCAA.Aragón),
    TOLEDO("Toledo", CCAA.Castilla_la_Mancha),
    VALENCIA("Valencia", CCAA.Comunitat_Valenciana),
    VALLADOLID("Valladolid", CCAA.Castilla_y_Léon),
    VIZCAYA("Vizcaya", CCAA.País_Vasco),
    ZAMORA("Zamora", CCAA.Castilla_y_Léon),
    ZARAGOZA("Zaragoza", CCAA.Aragón);

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
