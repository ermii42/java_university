package practiki.prac_10.task_3;

public class TextDocument implements IDocument{
    @Override
    public IDocument CreateNew(String src) {
        return new TextDocument();
    }

    @Override
    public IDocument CreateOpen(String src) {
        return new TextDocument();
    }
}
