package Command;

/**
 * Created by Asus on 17.05.2016.
 */
public class SendService extends Service {

    public SendService(Post post) {
        super(post);
    }

    @Override
    void execute() {
        post.send();
    }
}
