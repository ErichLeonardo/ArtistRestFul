package org.Hamm.model;

public enum Province {
    A_CORUÑA("A Coruña", CCAA.GALICIA),
    ÁLAVA("Álava", CCAA.PAIS_VASCO),
    ALBACETE("Albacete", CCAA.CASTILLA_LA_MANCHA),
    ALICANTE("Alicante", CCAA.COMUNITAT_VALENCIANA),    ALMERÍA("Almería", CCAA.ANDALUCIA),
    ASTURIAS("Asturias", CCAA.ASTURIAS),
    ÁVILA("Ávila", CCAA.CASTILLA_Y_LEON),
    BADAJOZ("Badajoz", CCAA.EXTREMADURA),
    BALEARES("Baleares", CCAA.BALEARES),
    BARCELONA("Barcelona", CCAA.CATALUNYA),
    BURGOS("Burgos", CCAA.CASTILLA_Y_LEON),
    CÁCERES("Cáceres", CCAA.EXTREMADURA),
    CÁDIZ("Cádiz", CCAA.ANDALUCIA),
    CANTABRIA("Cantabria", CCAA.CANTABRIA),
    CASTELLÓN("Castellón", CCAA.COMUNITAT_VALENCIANA),
    CIUDAD_REAL("Ciudad Real", CCAA.CASTILLA_LA_MANCHA),
    CÓRDOBA("Córdoba", CCAA.ANDALUCIA),
    CUENCA("Cuenca", CCAA.CASTILLA_LA_MANCHA),
    GIRONA("Girona", CCAA.CATALUNYA),
    GRANADA("Granada", CCAA.ANDALUCIA),
    GUADALAJARA("Guadalajara", CCAA.CASTILLA_LA_MANCHA),
    GIPUZKOA("Gipuzkoa", CCAA.PAIS_VASCO),
    HUELVA("Huelva", CCAA.ANDALUCIA),
    HUESCA("Huesca", CCAA.ARAGON),
    JAÉN("Jaén", CCAA.ANDALUCIA),
    LA_RIOJA("La Rioja", CCAA.RIOJA),
    LAS_PALMAS("Las Palmas", CCAA.CANARIAS),
    LEÓN("León", CCAA.CASTILLA_Y_LEON),
    LÉRIDA("Lérida", CCAA.CATALUNYA),
    LUGO("Lugo", CCAA.GALICIA),
    MADRID("Madrid", CCAA.MADRID),
    MÁLAGA("Málaga", CCAA.ANDALUCIA),
    MURCIA("Murcia", CCAA.MURCIA),
    NAVARRA("Navarra", CCAA.NAVARRA),
    OURENSE("Ourense", CCAA.GALICIA),
    PALENCIA("Palencia", CCAA.CASTILLA_Y_LEON),
    PONTEVEDRA("Pontevedra", CCAA.GALICIA),
    SALAMANCA("Salamanca", CCAA.CASTILLA_Y_LEON),
    SEGOVIA("Segovia", CCAA.CASTILLA_Y_LEON),
    SEVILLA("Sevilla", CCAA.ANDALUCIA),
    SORIA("Soria", CCAA.CASTILLA_Y_LEON),
    TARRAGONA("Tarragona", CCAA.CATALUNYA),
    SANTA_CRUZ_DE_TENERIFE("Santa Cruz de Tenerife", CCAA.CANARIAS),
    TERUEL("Teruel", CCAA.ARAGON),
    TOLEDO("Toledo", CCAA.CASTILLA_LA_MANCHA),
    VALENCIA("Valencia", CCAA.COMUNITAT_VALENCIANA),
    VALLADOLID("Valladolid", CCAA.CASTILLA_Y_LEON),
    VIZCAYA("Vizcaya", CCAA.PAIS_VASCO),
    ZAMORA("Zamora", CCAA.CASTILLA_Y_LEON),
    ZARAGOZA("Zaragoza", CCAA.ARAGON);

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
