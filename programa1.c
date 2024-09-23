#include <stdio.h>
#include <string.h>

void ejercicio1();
void ejercicio2();
void ejercicio3();
void ejercicio4();
void ejercicio5();

int main(void)
{
    int op;
    printf("SELECCIONA UN NUMERO DEL 1-5 Y SIGUE LAS INSTRUCCIONES\n");
    if (op == 1)
        ejercicio1();
    else if (op == 2)
        ejercicio2();
    else if (op == 3)
        ejercicio3();
    else if (op == 4)
        ejercicio4();
    else if (op == 5)
        ejercicio5();
    else
    {
        printf("\nQue del 1-5 tonto >:(");
        return 1;
    }
    return 0;
}

// Promedio
void ejercicio1()
{
    int alumnos, i = 0;
    double calif = 0.0, suma = 0.0;
    printf("Ingresar el número de alumnos ");
    scanf("%d", &alumnos);
    do
    {
        printf("Ingresa el alumno %d: ", i + 1);
        scanf("%lf", &calif);
        suma = calif + suma;
        i++;
    } while (alumnos != i);
    printf("El promedio del el salon es: %.5lf\n", (float)suma / alumnos);
}

// Fcatorial
void ejercicio2()
{
    int n, i = 1, mult = 1;
    printf("Ingresa un nuero: ");
    scanf("%d", &n);
    do
    {
        mult = i * mult;
        i++;
    } while (i <= n);
    printf("%d\n", mult);
}

// menu
void ejercicio3()
{
    int op;
    char arr[100], arr2[20];
    printf("Selecciona el alimento\n");
    printf("1. Sincronizada\n");
    printf("2. Quesadilla\n");
    printf("3. Pastel\n--");
    scanf("%d", &op);

    if (op == 1)
        strcpy(arr, "Sincronizada y ");
    else if (op == 2)
        strcpy(arr, "Sincronizada y ");
    else if (op == 3)
        strcpy(arr, "Pastel");
    else
        return;

    printf("Selecciona el alimento\n");
    printf("1. Refresco\n");
    printf("2. Agua\n");
    printf("3. Bebida de dieta\n--");
    scanf("%d", &op);

    if (op == 1)
        strcat(arr, "Refresco");
    else if (op == 2)
        strcat(arr, "Agua");
    else if (op == 3)
        strcat(arr, "Bebida de dieta");
    else
        return;

    puts(arr);
}

// num mayors
void ejercicio4()
{
    int n, i = 1, num1 = 0, temp = 0;
    printf("\nCuantos numeros va a comparar: ");
    scanf("%d", &n);
    printf("\nIngresa el numero %d: ", i);
    scanf("%d", &num1);
    do
    {
        printf("\nIngresa el numero %d: ", i + 1);
        scanf("%d", &temp);
        if (num1 < temp)
            num1 = temp;
        i++;
    } while (i != n);
    printf("el numero es: %d\n", num1);
}

// par o no par
void ejercicio5()
{
    int n;
    printf("Ingresa un nuero: ");
    scanf("%d", &n);

    if (n == 0)
        printf("El numero es 0\n");
    else if (n % 2 == 0)
        printf("El numero es par\n");
    else
        printf("El numero no es par\n");
}