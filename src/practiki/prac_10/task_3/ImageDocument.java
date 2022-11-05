package practiki.prac_10.task_3;

public class ImageDocument implements IDocument{
    @Override
    public IDocument CreateNew(String src) {
        return new ImageDocument();
    }

    @Override
    public IDocument CreateOpen(String src) {
        return new ImageDocument();
    }
}
