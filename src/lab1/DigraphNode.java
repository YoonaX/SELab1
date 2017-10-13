package lab1;

/*this is B2 second change*/
public class DigraphNode
{
	String Words;
	DigraphNode Next;
	int Weight;
	int AdjPointNumber;//表示多少个点与表头节点连接
	boolean flag = false;

	public DigraphNode()
	{
		Next = null;
		AdjPointNumber = 0;
	}
}