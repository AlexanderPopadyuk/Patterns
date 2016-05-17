package Command;

/**
 * Created by Asus on 17.05.2016.
 */
public class GiveService extends Service{
    public GiveService(Post post) {
        super(post);
    }
    @Override
    void execute() {
        post.give();
    }
}
