package back.exception;

public class CoreError extends AssertionError {
    /** Вызывает ошибку
     *
     * @param message описание ошибки
     * @param ex вызванное исключение
     */
    public CoreError(String message, Throwable ex) {
        super(message, ex);
    }

}
