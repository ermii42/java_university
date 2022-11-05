package practiki.prac_10.task_3;

public class MusicDocument implements IDocument{
    @Override
    public IDocument CreateNew(String src) {
        return new MusicDocument();
    }

    @Override
    public IDocument CreateOpen(String src) {
        return new MusicDocument();
    }
}
