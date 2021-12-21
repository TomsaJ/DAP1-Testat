public class CharacterSearchTree
{
    //--- hier ergaenzen ---
    public int apply()
    {
        if (!isEmpty ())
        {
            if(leftChild.isEmpty() && rightChild.isEmpty()){
                if (content.getQuantity()>1)
                {
                    return leftChild.apply()+rightChild.apply()+1;
                }
            }else{
                return leftChild.apply()+rightChild.apply();
            }
        }
        return 0;
    }

    // --- Vorgaben ---
    private HuffmanTriple content;
    private CharacterSearchTree leftChild, rightChild;

    public CharacterSearchTree()
    {
        content = null;
        leftChild = null;
        rightChild = null;
    }

    public HuffmanTriple getContent()
    {
        if ( !isEmpty() )
        {
            return content;
        } else {
            throw new RuntimeException();
        }
    }

    public boolean isEmpty()
    {
        return content == null;
    }

    public boolean isLeaf()
    {
        return !isEmpty() && leftChild.isEmpty() && rightChild.isEmpty();
    }

    public void iterativeAdd( char t )
    {
        CharacterSearchTree current = this;
        while ( !current.isEmpty() && current.content.getToken() != t )
        {
            if ( current.content.getToken() > t )
            {
                current = current.leftChild;
            }
            else
            {
                current = current.rightChild;
            }
        }
        if ( current.isEmpty() )
        {
            current.content = new HuffmanTriple( t );
            current.leftChild = new CharacterSearchTree();
            current.rightChild = new CharacterSearchTree();
        }
        else
        {
            current.content.incrementQuantity();
        }
    }

    public void show()
    {
        if ( !isEmpty() )
        {
            leftChild.show();
            System.out.println( content.toString() );
            rightChild.show();
        }
    }

        public HuffmanTriple()
        {
            this( ' ', 0 );
        }

        public HuffmanTriple( char t )
        {
            this( t, 1 );
        }

        public HuffmanTriple( char t, int q )
        {
            token = t;
            code = "";
            quantity = q;
        }

        public char getToken()
        {
            return token;
        }

        public String getCode()
        {
            return code;
        }

        public void setCode( String c )
        {
            code = c;
        }

        public int getQuantity()
        {
            return quantity;
        }

        public void incrementQuantity()
        {
            quantity++;
        }

        public int compareTo( HuffmanTriple other)
        {
            return quantity - other.quantity;
        }

        public String toString()
        {
            return "token (quantity: " + quantity + "): " + token + " -> code: " + code ;
        }

}
