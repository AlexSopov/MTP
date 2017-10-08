import ArraySorting.Sortable;

class SortingMetricsProvider {
    private long timeStart;
    private long memoryStart;
    private long timeEnd;
    private long memoryEnd;

    void metricsStart() {
        timeStart = System.currentTimeMillis();
        memoryStart = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
    }
    void metricsEnd() {
        timeEnd = System.currentTimeMillis();
        memoryEnd = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
    }

    long getTime() {
        return timeEnd - timeStart;
    }
    long getMemory() {
        return memoryEnd - memoryStart;
    }
}
