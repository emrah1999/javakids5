package lesson7CommentlerAndVariables;

/**
 * Dairənin həndəsi hesablamalarını yerinə yetirir.
 * @author Kamran Əliyev
 * @version 1.0
 * @since 2024
 */
public class Daire {

    /* PI sabitinin dəqiq dəyəri
    hesablamalar üçün istifadə olunur */
    private static final double PI = 3.14159;

    /**
     * Dairənin sahəsini hesablayır.
     * @param radius dairənin radiusu (müsbət ədəd)
     * @return sahə dəyərini qaytarır
     * @throws IllegalArgumentException radius mənfi olduqda
     */
    public double sahəHesabla(double radius) {
        // Mənfi radius yoxlanılır
        if (radius < 0) {
            throw new IllegalArgumentException("Radius mənfi ola bilməz");
        }
        return PI * radius * radius; // S = π * r²
    }
}

