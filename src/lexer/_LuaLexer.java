/* The following code was generated by JFlex 1.4.1 on 4/10/10 2:48 PM */

package com.sylvanaar.idea.Lua.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import java.util.*;
import java.lang.reflect.Field;
import org.jetbrains.annotations.NotNull;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.1
 * on 4/10/10 2:48 PM from the specification file
 * <tt>lua.flex</tt>
 */
class _LuaLexer implements FlexLexer, LuaTokenTypes {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int XLONGSTRING = 1;
  public static final int XSTRINGA = 6;
  public static final int XLONGCOMMENT = 4;
  public static final int XSHORTCOMMENT = 3;
  public static final int YYINITIAL = 0;
  public static final int XSTRINGQ = 5;
  public static final int XLONGSTRING_BEGIN = 2;

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\1\1\3\1\0\1\1\1\2\22\0\1\1\1\44\1\41"+
    "\1\43\1\0\1\51\1\0\1\42\1\53\1\54\1\50\1\10\1\60"+
    "\1\40\1\11\1\52\12\6\1\62\1\61\1\46\1\12\1\45\2\0"+
    "\4\4\1\7\25\4\1\13\1\64\1\55\1\63\1\4\1\0\1\14"+
    "\1\17\1\31\1\16\1\21\1\27\1\4\1\34\1\26\1\4\1\22"+
    "\1\24\1\37\1\15\1\23\1\33\1\36\1\20\1\25\1\32\1\30"+
    "\1\5\1\35\3\4\1\56\1\0\1\57\1\47\uff81\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\7\0\1\1\1\2\2\3\1\4\1\2\1\5\1\6"+
    "\1\7\1\10\1\11\16\4\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\1\1\20\1\21\1\22\1\23\1\24"+
    "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\2\34"+
    "\1\35\1\36\1\37\2\36\2\40\1\41\1\42\1\43"+
    "\1\41\1\44\1\43\1\41\2\0\1\45\1\46\1\0"+
    "\1\47\3\4\1\50\4\4\1\51\1\4\1\52\1\53"+
    "\10\4\1\54\1\55\1\56\1\57\1\60\1\0\1\61"+
    "\1\0\1\62\2\0\1\63\1\5\1\0\1\5\1\64"+
    "\1\65\1\66\1\67\4\4\1\70\3\4\1\71\6\4"+
    "\1\54\4\4\1\72\4\4\1\73\1\74\2\4\1\75"+
    "\4\4\1\76\1\77\1\4\1\100\1\101\1\4\1\102"+
    "\1\103\1\4\1\104\1\4\1\105\1\106\1\4\1\107";

  private static int [] zzUnpackAction() {
    int [] result = new int[161];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\65\0\152\0\237\0\324\0\u0109\0\u013e\0\u0173"+
    "\0\u01a8\0\u01dd\0\u0173\0\u0212\0\u0247\0\u027c\0\u0173\0\u02b1"+
    "\0\u02e6\0\u031b\0\u0350\0\u0385\0\u03ba\0\u03ef\0\u0424\0\u0459"+
    "\0\u048e\0\u04c3\0\u04f8\0\u052d\0\u0562\0\u0597\0\u05cc\0\u0601"+
    "\0\u0636\0\u0173\0\u0173\0\u066b\0\u06a0\0\u06d5\0\u070a\0\u0173"+
    "\0\u0173\0\u0173\0\u0173\0\u0173\0\u0173\0\u0173\0\u0173\0\u0173"+
    "\0\u0173\0\u0173\0\u0173\0\u0173\0\u073f\0\u0173\0\u0173\0\u0173"+
    "\0\u0774\0\u07a9\0\u0173\0\u07de\0\u0173\0\u0173\0\u0813\0\u0848"+
    "\0\u0173\0\u087d\0\u08b2\0\u08e7\0\u091c\0\u0951\0\u0173\0\u031b"+
    "\0\u0173\0\u0986\0\u09bb\0\u09f0\0\u0212\0\u0a25\0\u0a5a\0\u0a8f"+
    "\0\u0ac4\0\u0212\0\u0af9\0\u0212\0\u0212\0\u0b2e\0\u0b63\0\u0b98"+
    "\0\u0bcd\0\u0c02\0\u0c37\0\u0c6c\0\u0ca1\0\u0cd6\0\u0173\0\u0173"+
    "\0\u0173\0\u0173\0\u073f\0\u0173\0\u0774\0\u0173\0\u07a9\0\u07de"+
    "\0\u0173\0\u0d0b\0\u0d0b\0\u0d40\0\u0173\0\u0212\0\u0212\0\u0212"+
    "\0\u0d75\0\u0daa\0\u0ddf\0\u0e14\0\u0212\0\u0e49\0\u0e7e\0\u0eb3"+
    "\0\u0212\0\u0ee8\0\u0f1d\0\u0f52\0\u0f87\0\u0fbc\0\u0ff1\0\u0173"+
    "\0\u1026\0\u105b\0\u1090\0\u10c5\0\u10fa\0\u112f\0\u1164\0\u1199"+
    "\0\u11ce\0\u0212\0\u0212\0\u1203\0\u1238\0\u0212\0\u126d\0\u12a2"+
    "\0\u12d7\0\u130c\0\u0212\0\u0212\0\u1341\0\u0212\0\u0212\0\u1376"+
    "\0\u0212\0\u0212\0\u13ab\0\u0212\0\u13e0\0\u0212\0\u0212\0\u1415"+
    "\0\u0212";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[161];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\14"+
    "\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26"+
    "\1\27\1\30\1\14\1\31\1\32\1\14\1\33\1\34"+
    "\1\35\1\14\1\36\2\14\1\37\1\14\1\40\1\41"+
    "\1\42\1\43\1\44\1\10\1\45\1\46\1\47\1\50"+
    "\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60"+
    "\1\61\1\62\1\63\1\10\55\64\1\65\7\64\3\66"+
    "\1\13\61\66\2\67\2\70\7\67\1\71\24\67\1\72"+
    "\24\67\55\73\1\74\7\73\2\75\2\76\35\75\1\77"+
    "\22\75\1\100\2\75\2\101\36\75\1\102\21\75\1\103"+
    "\66\0\1\11\3\0\1\11\62\0\1\13\65\0\4\14"+
    "\4\0\24\14\26\0\1\11\2\0\1\14\1\15\2\14"+
    "\4\0\24\14\33\0\1\16\1\104\1\0\1\105\7\0"+
    "\1\104\54\0\1\106\65\0\1\107\64\0\1\110\1\111"+
    "\55\0\4\14\4\0\1\14\1\112\22\14\31\0\4\14"+
    "\4\0\7\14\1\113\2\14\1\114\11\14\31\0\4\14"+
    "\4\0\7\14\1\115\14\14\31\0\4\14\4\0\4\14"+
    "\1\116\17\14\31\0\4\14\4\0\5\14\1\117\16\14"+
    "\31\0\4\14\4\0\1\14\1\120\6\14\1\121\13\14"+
    "\31\0\4\14\4\0\4\14\1\122\17\14\31\0\4\14"+
    "\4\0\7\14\1\123\14\14\31\0\4\14\4\0\1\14"+
    "\1\124\11\14\1\125\10\14\31\0\4\14\4\0\1\126"+
    "\6\14\1\127\4\14\1\130\7\14\31\0\4\14\4\0"+
    "\1\14\1\131\22\14\31\0\4\14\4\0\4\14\1\132"+
    "\13\14\1\133\3\14\31\0\4\14\4\0\20\14\1\134"+
    "\3\14\31\0\4\14\4\0\7\14\1\135\14\14\65\0"+
    "\1\136\70\0\1\137\32\0\1\140\64\0\1\141\64\0"+
    "\1\142\64\0\1\143\42\0\1\144\21\0\1\145\1\146"+
    "\64\0\1\145\24\0\1\147\36\0\1\150\42\0\1\151"+
    "\50\0\1\75\26\0\1\75\1\0\1\75\5\0\3\75"+
    "\1\0\2\75\6\0\1\75\2\0\1\75\6\0\2\75"+
    "\12\0\1\75\6\0\1\75\42\0\1\75\25\0\1\75"+
    "\1\0\1\75\5\0\3\75\1\0\2\75\6\0\1\75"+
    "\2\0\1\75\7\0\1\75\12\0\1\75\6\0\1\75"+
    "\6\0\1\152\1\0\1\153\27\0\1\153\32\0\1\154"+
    "\67\0\1\155\57\0\4\14\4\0\2\14\1\156\21\14"+
    "\31\0\4\14\4\0\16\14\1\157\5\14\31\0\4\14"+
    "\4\0\10\14\1\160\13\14\31\0\4\14\4\0\5\14"+
    "\1\161\16\14\31\0\4\14\4\0\16\14\1\162\1\163"+
    "\2\14\1\164\1\14\31\0\4\14\4\0\2\14\1\165"+
    "\21\14\31\0\4\14\4\0\11\14\1\166\12\14\31\0"+
    "\4\14\4\0\15\14\1\167\6\14\31\0\4\14\4\0"+
    "\10\14\1\170\13\14\31\0\4\14\4\0\4\14\1\171"+
    "\17\14\31\0\4\14\4\0\1\14\1\172\22\14\31\0"+
    "\4\14\4\0\16\14\1\173\5\14\31\0\4\14\4\0"+
    "\14\14\1\174\7\14\31\0\4\14\4\0\5\14\1\175"+
    "\16\14\31\0\4\14\4\0\12\14\1\176\11\14\31\0"+
    "\4\14\4\0\2\14\1\177\21\14\40\0\1\200\24\0"+
    "\1\136\32\0\1\152\64\0\1\154\1\104\11\0\1\104"+
    "\47\0\4\14\4\0\1\201\23\14\31\0\4\14\4\0"+
    "\14\14\1\202\7\14\31\0\4\14\4\0\5\14\1\203"+
    "\16\14\31\0\4\14\4\0\14\14\1\204\7\14\31\0"+
    "\4\14\4\0\5\14\1\205\16\14\31\0\4\14\4\0"+
    "\1\206\23\14\31\0\4\14\4\0\11\14\1\207\12\14"+
    "\31\0\4\14\4\0\15\14\1\210\6\14\31\0\4\14"+
    "\4\0\12\14\1\211\11\14\31\0\4\14\4\0\5\14"+
    "\1\212\16\14\31\0\4\14\4\0\1\14\1\213\22\14"+
    "\31\0\4\14\4\0\10\14\1\214\13\14\31\0\4\14"+
    "\4\0\14\14\1\215\7\14\31\0\4\14\4\0\6\14"+
    "\1\216\15\14\31\0\4\14\4\0\4\14\1\217\17\14"+
    "\31\0\4\14\4\0\1\220\23\14\31\0\4\14\4\0"+
    "\12\14\1\221\11\14\31\0\4\14\4\0\12\14\1\222"+
    "\11\14\31\0\4\14\4\0\10\14\1\223\13\14\31\0"+
    "\4\14\4\0\5\14\1\224\16\14\31\0\4\14\4\0"+
    "\16\14\1\225\5\14\31\0\4\14\4\0\10\14\1\226"+
    "\13\14\31\0\4\14\4\0\5\14\1\227\16\14\31\0"+
    "\4\14\4\0\10\14\1\230\13\14\31\0\4\14\4\0"+
    "\1\14\1\231\22\14\31\0\4\14\4\0\16\14\1\232"+
    "\5\14\31\0\4\14\4\0\4\14\1\233\17\14\31\0"+
    "\4\14\4\0\13\14\1\234\10\14\31\0\4\14\4\0"+
    "\12\14\1\235\11\14\31\0\4\14\4\0\5\14\1\236"+
    "\16\14\31\0\4\14\4\0\5\14\1\237\16\14\31\0"+
    "\4\14\4\0\7\14\1\240\14\14\31\0\4\14\4\0"+
    "\1\14\1\241\22\14\25\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5194];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\7\0\1\11\2\1\1\11\3\1\1\11\22\1\2\11"+
    "\4\1\15\11\1\1\3\11\2\1\1\11\1\1\2\11"+
    "\2\1\1\11\2\1\2\0\1\1\1\11\1\0\1\11"+
    "\25\1\4\11\1\0\1\11\1\0\1\11\2\0\1\11"+
    "\1\1\1\0\1\1\1\11\22\1\1\11\41\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[161];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** this buffer may contains the current text array to be matched when it is cheap to acquire it */
  private char[] zzBufferArray;

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    int yyline, yychar, yycolumn;

    ExtendedSyntaxStrCommentHandler longCommentOrStringHandler = new ExtendedSyntaxStrCommentHandler();


  _LuaLexer(java.io.Reader in) {
      this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  _LuaLexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 136) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart(){
    return zzStartRead;
  }

  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end,int initialState){
    zzBuffer = buffer;
    zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  public void reset(CharSequence buffer, int initialState){
    reset(buffer, 0, buffer.length(), initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBufferArray != null ? zzBufferArray[zzStartRead+pos]:zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;
    char[] zzBufferArrayL = zzBufferArray;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL.charAt(zzCurrentPosL)) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL.charAt(zzMarkedPosL) == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL.charAt(zzMarkedPosL) == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = zzLexicalState;


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL.charAt(zzCurrentPosL++);
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL.charAt(zzCurrentPosL++);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 43: 
          { return IF;
          }
        case 72: break;
        case 71: 
          { return FUNCTION;
          }
        case 73: break;
        case 51: 
          { if (longCommentOrStringHandler.isCurrentExtQuoteStart(yytext())) {
                       yybegin(YYINITIAL); longCommentOrStringHandler.resetCurrentExtQuoteStart(); return LONGCOMMENT_END;
                       }  else { yypushback(yytext().length()-1); }
                        return LONGCOMMENT;
          }
        case 74: break;
        case 27: 
          { return EXP;
          }
        case 75: break;
        case 36: 
          { yybegin(YYINITIAL);return WRONG;
          }
        case 76: break;
        case 15: 
          { return LT;
          }
        case 77: break;
        case 39: 
          { longCommentOrStringHandler.setCurrentExtQuoteStart(yytext().toString()); yybegin( XLONGSTRING_BEGIN ); return LONGSTRING_BEGIN;
          }
        case 78: break;
        case 56: 
          { return END;
          }
        case 79: break;
        case 37: 
          { return CONCAT;
          }
        case 80: break;
        case 16: 
          { return MULT;
          }
        case 81: break;
        case 2: 
          { return WS;
          }
        case 82: break;
        case 49: 
          { if (longCommentOrStringHandler.isCurrentExtQuoteStart(yytext())) {
                       yybegin(YYINITIAL); longCommentOrStringHandler.resetCurrentExtQuoteStart(); return LONGSTRING_END;
                       } else { yypushback(yytext().length()-1); }
                        return LONGSTRING;
          }
        case 83: break;
        case 3: 
          { return NEWLINE;
          }
        case 84: break;
        case 9: 
          { return LBRACK;
          }
        case 85: break;
        case 21: 
          { return RBRACK;
          }
        case 86: break;
        case 13: 
          { return GETN;
          }
        case 87: break;
        case 67: 
          { return REPEAT;
          }
        case 88: break;
        case 52: 
          { return ELLIPSIS;
          }
        case 89: break;
        case 22: 
          { return LCURLY;
          }
        case 90: break;
        case 5: 
          { return NUMBER;
          }
        case 91: break;
        case 17: 
          { return MOD;
          }
        case 92: break;
        case 23: 
          { return RCURLY;
          }
        case 93: break;
        case 63: 
          { return FALSE;
          }
        case 94: break;
        case 44: 
          { yypushback(yylength()); yybegin( XSHORTCOMMENT ); return advance();
          }
        case 95: break;
        case 24: 
          { return COMMA;
          }
        case 96: break;
        case 7: 
          { return DOT;
          }
        case 97: break;
        case 42: 
          { return IN;
          }
        case 98: break;
        case 41: 
          { return OR;
          }
        case 99: break;
        case 25: 
          { return SEMI;
          }
        case 100: break;
        case 18: 
          { return DIV;
          }
        case 101: break;
        case 34: 
          { yybegin(YYINITIAL); return WRONG;
          }
        case 102: break;
        case 30: 
          { return SHORTCOMMENT;
          }
        case 103: break;
        case 4: 
          { return NAME;
          }
        case 104: break;
        case 12: 
          { yybegin(XSTRINGA); return STRING;
          }
        case 105: break;
        case 70: 
          { return REQUIRE;
          }
        case 106: break;
        case 26: 
          { return COLON;
          }
        case 107: break;
        case 54: 
          { return NOT;
          }
        case 108: break;
        case 53: 
          { return AND;
          }
        case 109: break;
        case 31: 
          { yybegin(YYINITIAL); return SHORTCOMMENT;
          }
        case 110: break;
        case 45: 
          { yybegin( XSHORTCOMMENT ); return SHEBANG;
          }
        case 111: break;
        case 32: 
          { return LONGCOMMENT;
          }
        case 112: break;
        case 8: 
          { return ASSIGN;
          }
        case 113: break;
        case 46: 
          { return GE;
          }
        case 114: break;
        case 35: 
          { yybegin(YYINITIAL); return STRING;
          }
        case 115: break;
        case 1: 
          { return WRONG;
          }
        case 116: break;
        case 68: 
          { return ELSEIF;
          }
        case 117: break;
        case 64: 
          { return UNTIL;
          }
        case 118: break;
        case 60: 
          { return THEN;
          }
        case 119: break;
        case 40: 
          { return DO;
          }
        case 120: break;
        case 14: 
          { return GT;
          }
        case 121: break;
        case 62: 
          { return LOCAL;
          }
        case 122: break;
        case 28: 
          { return LONGSTRING;
          }
        case 123: break;
        case 58: 
          { return ELSE;
          }
        case 124: break;
        case 29: 
          { yypushback(1); yybegin(XLONGSTRING); return advance();
          }
        case 125: break;
        case 66: 
          { return RETURN;
          }
        case 126: break;
        case 65: 
          { return WHILE;
          }
        case 127: break;
        case 48: 
          { return NE;
          }
        case 128: break;
        case 10: 
          { return MINUS;
          }
        case 129: break;
        case 11: 
          { yybegin(XSTRINGQ);  return STRING;
          }
        case 130: break;
        case 55: 
          { return NIL;
          }
        case 131: break;
        case 33: 
          { return STRING;
          }
        case 132: break;
        case 59: 
          { return TRUE;
          }
        case 133: break;
        case 57: 
          { return FOR;
          }
        case 134: break;
        case 19: 
          { return LPAREN;
          }
        case 135: break;
        case 61: 
          { return BREAK;
          }
        case 136: break;
        case 20: 
          { return RPAREN;
          }
        case 137: break;
        case 69: 
          { return MODULE;
          }
        case 138: break;
        case 38: 
          { return EQ;
          }
        case 139: break;
        case 6: 
          { return PLUS;
          }
        case 140: break;
        case 50: 
          { longCommentOrStringHandler.setCurrentExtQuoteStart(yytext().toString());   yybegin(XLONGCOMMENT); return LONGCOMMENT_BEGIN;
          }
        case 141: break;
        case 47: 
          { return LE;
          }
        case 142: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
            return null;
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}