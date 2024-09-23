#include <stdio.h>
#include <string.h>

int main(int argc, char *argv[]) {
    if (argc != 2) {
        printf("Uso: %s <palabra>\n", argv[0]);
        return 1;
    }

    char palabra[100];
    strcpy(palabra, argv[1]);

    // Verificar si la palabra es "clase" (ignorar mayúsculas y minúsculas)
    if (strcasecmp(palabra, "clase") == 0) {
        printf("En Java, una clase es una plantilla para la creación de objetos. Define propiedades y comportamientos que los objetos creados a partir de la clase deberán tener.\n");
    } else {
        printf("La palabra ingresada no es 'clase'.\n");
    }

    return 0;
}
