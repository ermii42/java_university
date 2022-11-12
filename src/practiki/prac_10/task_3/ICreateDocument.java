package practiki.prac_10.task_3;

public interface ICreateDocument extends IDocument {
    public IDocument CreateNew(String src);
    public IDocument CreateOpen(String src);
}
