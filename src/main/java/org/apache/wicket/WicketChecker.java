package org.apache.wicket;

public final class WicketChecker {
    
    private WicketChecker() {}
    
    /**
     * Returns {@link Component#isInitialized()}
     */
    public static boolean isComponentInitialized(Component component) {
        return component.isInitialized();
    }
    
    /**
     * Makes sure the component has already been initialized, otherwise throws an {@link IllegalStateException}.
     *
     * @param component the component to check
     * @throws IllegalStateException
     */
    public static void checkComponentInitialized(Component component) {
        if (!component.isInitialized()) {
            throw new IllegalStateException("Component is not yet initialized: " + component);
        }
    }
    
    /**
     * Makes sure the component has not yet been initialized, otherwise throws an {@link IllegalStateException}.
     *
     * @param component the component to check
     * @throws IllegalStateException
     */
    public static void checkComponentNotInitialized(Component component) {
        if (component.isInitialized()) {
            throw new IllegalStateException("Component is already initialized: " + component);
        }
    }
    
}
