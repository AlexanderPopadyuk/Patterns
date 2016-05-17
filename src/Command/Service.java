package Command;

/**
 * Created by Asus on 17.05.2016.
 */
public abstract class Service {
    Post post;

    public Service(Post post) {
        this.post = post;
    }

    abstract void execute();
}
