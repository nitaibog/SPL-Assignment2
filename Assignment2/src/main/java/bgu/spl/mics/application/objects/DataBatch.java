package bgu.spl.mics.application.objects;

/**
 * Passive object representing a data used by a model.
 * Add fields and methods to this class as you see fit (including public methods and constructors).
 */

public class DataBatch {

    private Data data;
    private int start_index;
    private Data.Type type;

    public DataBatch(Data data){
        this.data = data;
        this.type = data.getType();

    }

    public Data getData() {
        return data;
    }

    public Data.Type getType() {
        return type;
    }
}
