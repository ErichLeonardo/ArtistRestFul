API de Artistas y Posts

Esta es una aplicación Spring Boot que proporciona una API para la gestión de artistas y posts. La aplicación está diseñada para permitir a los usuarios realizar operaciones CRUD (Crear, Leer, Actualizar y Eliminar) sobre artistas y posts asociados.
Requisitos previos

    Java 8 o superior instalado en el sistema.
    Maven para la gestión de dependencias.

Configuración

    Clona este repositorio en tu máquina local utilizando el siguiente comando:

    bash

git clone https://github.com/ErichLeonardo/ArtistRestFul.git

Navega hasta el directorio del proyecto:

bash

cd tu-repositorio

Ejecuta la aplicación utilizando Maven:

arduino

    mvn spring-boot:run

Uso

Una vez que la aplicación esté en funcionamiento, puedes acceder a la API utilizando las siguientes rutas base:

    Artistas: /artist
    Posts: /post

Operaciones soportadas por ArtistController

    GET /artist: Devuelve una lista de todos los artistas.
    GET /artist/id?id={id}: Devuelve los detalles de un artista por ID.
    GET /artist/artist_name?artistName={artistName}: Devuelve un artista por nombre de artista.
    GET /artist/name?name={name}: Devuelve un artista por nombre.
    GET /artist/email?email={email}: Devuelve un artista por email.
    GET /artist/image?image={image}: Devuelve un artista por imagen.
    GET /artist/ccaa?CCAA={CCAA}: Devuelve una lista de artistas por CCAA.
    GET /artist/province?province={province}: Devuelve una lista de artistas por provincia.
    GET /artist/age?age={age}: Devuelve una lista de artistas por edad.
    POST /artist: Crea un nuevo artista.
    POST /artist/password?id={id}&newPassword={newPassword}: Actualiza la contraseña de un artista.
    DELETE /artist?id={id}: Elimina un artista.

Operaciones soportadas por PostController

    GET /post: Devuelve una lista de todos los posts.
    GET /post/id?id={id}: Devuelve los detalles de un post por ID.
    GET /post/title?title={title}: Devuelve un post por título.
    GET /post/content?content={content}: Devuelve un post por contenido.
    GET /post/media_url?mediaUrl={mediaUrl}: Devuelve un post por URL de medios.
    GET /post/artist?artist={artist}: Devuelve una lista de posts por artista.
    GET /post/ccaa?CCAA={CCAA}: Devuelve una lista de posts por CCAA del artista.
    GET /post/province?province={province}: Devuelve una lista de posts por provincia del artista.
    POST /post: Crea un nuevo post.
    DELETE /post?id={id}: Elimina un post.
    GET /post/count-posts-by-ccaa/{ccaa}: Devuelve el conteo de posts por CCAA.
    GET /post/count-posts-by-province/{province}: Devuelve el conteo de posts por provincia.

Contribuciones

Las contribuciones son bienvenidas. Si deseas contribuir a este proyecto, por favor sigue estos pasos:

    Realiza un fork del repositorio.
    Crea una nueva rama (git checkout -b feature/nueva-caracteristica).
    Realiza tus cambios y haz commits explicativos (git commit -am 'Agrega una nueva característica').
    Sube tu rama (git push origin feature/nueva-caracteristica).
    Crea un nuevo pull request.

Licencia

Este proyecto está licenciado bajo la Licencia MIT. Para más detalles, consulta el archivo LICENSE.
