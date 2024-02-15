package org.Hamm.model;

public enum CCAA {
    ANDALUCIA("Andalucía"),
    ARAGON("Aragon"),
    ASTURIAS("Asturias"),
    BALEARES("Baleares"),
    CANARIAS("Canarias"),
    CANTABRIA("Cantabria"),
    CASTILLA_Y_LEON("Castilla y Léon"),
    CASTILLA_LA_MANCHA("Castilla la Mancha"),
    CATALUNYA("Cataluña"),
    COMUNITAT_VALENCIANA("Comunitat Valenciana"),
    EXTREMADURA("Extremadura"),
    GALICIA("Galicia"),
    MADRID("Madrid"),
    MURCIA("Murcia"),
    NAVARRA("Navarra"),
    PAIS_VASCO("Pais Vasco"),
    RIOJA("Rioja"),
    CEUTA("Ceuta"),
    MELILLA("Melilla");

    private String name;

    CCAA(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
