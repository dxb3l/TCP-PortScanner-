# Prosty Scanner Portów TCP w Java

Prosty program napisany w języku Java do skanowania portów TCP na określonym adresie IP.

## Instrukcje

1. Skompiluj program za pomocą komendy:
    ```bash
    javac PortScanner.java
    ```

2. Uruchom program, podając jako argumenty adres IP oraz zakres portów do zeskanowania:
    ```bash
    java PortScanner <adres_IP> <początkowy_port> <końcowy_port>
    ```

    Na przykład:
    ```bash
    java PortScanner 127.0.0.1 80 100
    ```

3. Oczekuj na wyniki skanowania. Program wyświetli informacje o otwartych portach w zakresie.

## Ostrzeżenie

Ten program powinien być używany tylko do celów edukacyjnych lub w pełni legalnych testów zgodnych z obowiązującymi przepisami. Niewłaściwe użycie narzędzi do skanowania portów może naruszać prawo.

## Licencja

Ten program jest dostępny na licencji GNU. Szczegóły można znaleźć w pliku [LICENSE](LICENSE).
