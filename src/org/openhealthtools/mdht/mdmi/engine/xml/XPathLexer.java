// Generated from XPath.g4 by ANTLR 4.2
package org.openhealthtools.mdht.mdmi.engine.xml;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XPathLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__7=1, T__6=2, T__5=3, T__4=4, T__3=5, T__2=6, T__1=7, T__0=8, PATHSEP=9, 
		ABRPATH=10, LPAR=11, RPAR=12, LBRAC=13, RBRAC=14, MINUS=15, PLUS=16, DOT=17, 
		MUL=18, DOTDOT=19, AT=20, COMMA=21, PIPE=22, LESS=23, MORE=24, LE=25, 
		GE=26, COLON=27, CC=28, APOS=29, QUOT=30, NodeType=31, Number=32, AxisName=33, 
		Literal=34, Whitespace=35, NCName=36;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'or'", "'!='", "'and'", "'$'", "'='", "'processing-instruction'", "'div'", 
		"'mod'", "'/'", "'//'", "'('", "')'", "'['", "']'", "'-'", "'+'", "'.'", 
		"'*'", "'..'", "'@'", "','", "'|'", "'<'", "'>'", "'<='", "'>='", "':'", 
		"'::'", "'''", "'\"'", "NodeType", "Number", "AxisName", "Literal", "Whitespace", 
		"NCName"
	};
	public static final String[] ruleNames = {
		"T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "PATHSEP", 
		"ABRPATH", "LPAR", "RPAR", "LBRAC", "RBRAC", "MINUS", "PLUS", "DOT", "MUL", 
		"DOTDOT", "AT", "COMMA", "PIPE", "LESS", "MORE", "LE", "GE", "COLON", 
		"CC", "APOS", "QUOT", "NodeType", "Number", "Digits", "AxisName", "Literal", 
		"Whitespace", "NCName", "NCNameStartChar", "NCNameChar"
	};


	public XPathLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "XPath.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2&\u0195\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \5 \u00d5\n \3!\3!\3!\5!\u00da\n!\5!\u00dc\n!\3"+
		"!\3!\5!\u00e0\n!\3\"\6\"\u00e3\n\"\r\"\16\"\u00e4\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u0170\n#\3$\3$\7$\u0174"+
		"\n$\f$\16$\u0177\13$\3$\3$\3$\7$\u017c\n$\f$\16$\u017f\13$\3$\5$\u0182"+
		"\n$\3%\6%\u0185\n%\r%\16%\u0186\3&\3&\7&\u018b\n&\f&\16&\u018e\13&\3\'"+
		"\3\'\3(\3(\5(\u0194\n(\2\2)\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C\2E#G$I%K&M\2O\2\3\2\7\3\2$$\3\2))\5"+
		"\2\13\f\17\17\"\"\20\2C\\aac|\u00c2\u00d8\u00da\u00f8\u00fa\u0301\u0372"+
		"\u037f\u0381\u2001\u200e\u200f\u2072\u2191\u2c02\u2ff1\u3003\ud801\uf902"+
		"\ufdd1\ufdf2\uffff\7\2/\60\62;\u00b9\u00b9\u0302\u0371\u2041\u2042\u01aa"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2"+
		"\2\2K\3\2\2\2\3Q\3\2\2\2\5T\3\2\2\2\7W\3\2\2\2\t[\3\2\2\2\13]\3\2\2\2"+
		"\r_\3\2\2\2\17v\3\2\2\2\21z\3\2\2\2\23~\3\2\2\2\25\u0080\3\2\2\2\27\u0083"+
		"\3\2\2\2\31\u0085\3\2\2\2\33\u0087\3\2\2\2\35\u0089\3\2\2\2\37\u008b\3"+
		"\2\2\2!\u008d\3\2\2\2#\u008f\3\2\2\2%\u0091\3\2\2\2\'\u0093\3\2\2\2)\u0096"+
		"\3\2\2\2+\u0098\3\2\2\2-\u009a\3\2\2\2/\u009c\3\2\2\2\61\u009e\3\2\2\2"+
		"\63\u00a0\3\2\2\2\65\u00a3\3\2\2\2\67\u00a6\3\2\2\29\u00a8\3\2\2\2;\u00ab"+
		"\3\2\2\2=\u00ad\3\2\2\2?\u00d4\3\2\2\2A\u00df\3\2\2\2C\u00e2\3\2\2\2E"+
		"\u016f\3\2\2\2G\u0181\3\2\2\2I\u0184\3\2\2\2K\u0188\3\2\2\2M\u018f\3\2"+
		"\2\2O\u0193\3\2\2\2QR\7q\2\2RS\7t\2\2S\4\3\2\2\2TU\7#\2\2UV\7?\2\2V\6"+
		"\3\2\2\2WX\7c\2\2XY\7p\2\2YZ\7f\2\2Z\b\3\2\2\2[\\\7&\2\2\\\n\3\2\2\2]"+
		"^\7?\2\2^\f\3\2\2\2_`\7r\2\2`a\7t\2\2ab\7q\2\2bc\7e\2\2cd\7g\2\2de\7u"+
		"\2\2ef\7u\2\2fg\7k\2\2gh\7p\2\2hi\7i\2\2ij\7/\2\2jk\7k\2\2kl\7p\2\2lm"+
		"\7u\2\2mn\7v\2\2no\7t\2\2op\7w\2\2pq\7e\2\2qr\7v\2\2rs\7k\2\2st\7q\2\2"+
		"tu\7p\2\2u\16\3\2\2\2vw\7f\2\2wx\7k\2\2xy\7x\2\2y\20\3\2\2\2z{\7o\2\2"+
		"{|\7q\2\2|}\7f\2\2}\22\3\2\2\2~\177\7\61\2\2\177\24\3\2\2\2\u0080\u0081"+
		"\7\61\2\2\u0081\u0082\7\61\2\2\u0082\26\3\2\2\2\u0083\u0084\7*\2\2\u0084"+
		"\30\3\2\2\2\u0085\u0086\7+\2\2\u0086\32\3\2\2\2\u0087\u0088\7]\2\2\u0088"+
		"\34\3\2\2\2\u0089\u008a\7_\2\2\u008a\36\3\2\2\2\u008b\u008c\7/\2\2\u008c"+
		" \3\2\2\2\u008d\u008e\7-\2\2\u008e\"\3\2\2\2\u008f\u0090\7\60\2\2\u0090"+
		"$\3\2\2\2\u0091\u0092\7,\2\2\u0092&\3\2\2\2\u0093\u0094\7\60\2\2\u0094"+
		"\u0095\7\60\2\2\u0095(\3\2\2\2\u0096\u0097\7B\2\2\u0097*\3\2\2\2\u0098"+
		"\u0099\7.\2\2\u0099,\3\2\2\2\u009a\u009b\7~\2\2\u009b.\3\2\2\2\u009c\u009d"+
		"\7>\2\2\u009d\60\3\2\2\2\u009e\u009f\7@\2\2\u009f\62\3\2\2\2\u00a0\u00a1"+
		"\7>\2\2\u00a1\u00a2\7?\2\2\u00a2\64\3\2\2\2\u00a3\u00a4\7@\2\2\u00a4\u00a5"+
		"\7?\2\2\u00a5\66\3\2\2\2\u00a6\u00a7\7<\2\2\u00a78\3\2\2\2\u00a8\u00a9"+
		"\7<\2\2\u00a9\u00aa\7<\2\2\u00aa:\3\2\2\2\u00ab\u00ac\7)\2\2\u00ac<\3"+
		"\2\2\2\u00ad\u00ae\7$\2\2\u00ae>\3\2\2\2\u00af\u00b0\7e\2\2\u00b0\u00b1"+
		"\7q\2\2\u00b1\u00b2\7o\2\2\u00b2\u00b3\7o\2\2\u00b3\u00b4\7g\2\2\u00b4"+
		"\u00b5\7p\2\2\u00b5\u00d5\7v\2\2\u00b6\u00b7\7v\2\2\u00b7\u00b8\7g\2\2"+
		"\u00b8\u00b9\7z\2\2\u00b9\u00d5\7v\2\2\u00ba\u00bb\7r\2\2\u00bb\u00bc"+
		"\7t\2\2\u00bc\u00bd\7q\2\2\u00bd\u00be\7e\2\2\u00be\u00bf\7g\2\2\u00bf"+
		"\u00c0\7u\2\2\u00c0\u00c1\7u\2\2\u00c1\u00c2\7k\2\2\u00c2\u00c3\7p\2\2"+
		"\u00c3\u00c4\7i\2\2\u00c4\u00c5\7/\2\2\u00c5\u00c6\7k\2\2\u00c6\u00c7"+
		"\7p\2\2\u00c7\u00c8\7u\2\2\u00c8\u00c9\7v\2\2\u00c9\u00ca\7t\2\2\u00ca"+
		"\u00cb\7w\2\2\u00cb\u00cc\7e\2\2\u00cc\u00cd\7v\2\2\u00cd\u00ce\7k\2\2"+
		"\u00ce\u00cf\7q\2\2\u00cf\u00d5\7p\2\2\u00d0\u00d1\7p\2\2\u00d1\u00d2"+
		"\7q\2\2\u00d2\u00d3\7f\2\2\u00d3\u00d5\7g\2\2\u00d4\u00af\3\2\2\2\u00d4"+
		"\u00b6\3\2\2\2\u00d4\u00ba\3\2\2\2\u00d4\u00d0\3\2\2\2\u00d5@\3\2\2\2"+
		"\u00d6\u00db\5C\"\2\u00d7\u00d9\7\60\2\2\u00d8\u00da\5C\"\2\u00d9\u00d8"+
		"\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00dc\3\2\2\2\u00db\u00d7\3\2\2\2\u00db"+
		"\u00dc\3\2\2\2\u00dc\u00e0\3\2\2\2\u00dd\u00de\7\60\2\2\u00de\u00e0\5"+
		"C\"\2\u00df\u00d6\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0B\3\2\2\2\u00e1\u00e3"+
		"\4\62;\2\u00e2\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4"+
		"\u00e5\3\2\2\2\u00e5D\3\2\2\2\u00e6\u00e7\7c\2\2\u00e7\u00e8\7p\2\2\u00e8"+
		"\u00e9\7e\2\2\u00e9\u00ea\7g\2\2\u00ea\u00eb\7u\2\2\u00eb\u00ec\7v\2\2"+
		"\u00ec\u00ed\7q\2\2\u00ed\u0170\7t\2\2\u00ee\u00ef\7c\2\2\u00ef\u00f0"+
		"\7p\2\2\u00f0\u00f1\7e\2\2\u00f1\u00f2\7g\2\2\u00f2\u00f3\7u\2\2\u00f3"+
		"\u00f4\7v\2\2\u00f4\u00f5\7q\2\2\u00f5\u00f6\7t\2\2\u00f6\u00f7\7/\2\2"+
		"\u00f7\u00f8\7q\2\2\u00f8\u00f9\7t\2\2\u00f9\u00fa\7/\2\2\u00fa\u00fb"+
		"\7u\2\2\u00fb\u00fc\7g\2\2\u00fc\u00fd\7n\2\2\u00fd\u0170\7h\2\2\u00fe"+
		"\u00ff\7c\2\2\u00ff\u0100\7v\2\2\u0100\u0101\7v\2\2\u0101\u0102\7t\2\2"+
		"\u0102\u0103\7k\2\2\u0103\u0104\7d\2\2\u0104\u0105\7w\2\2\u0105\u0106"+
		"\7v\2\2\u0106\u0170\7g\2\2\u0107\u0108\7e\2\2\u0108\u0109\7j\2\2\u0109"+
		"\u010a\7k\2\2\u010a\u010b\7n\2\2\u010b\u0170\7f\2\2\u010c\u010d\7f\2\2"+
		"\u010d\u010e\7g\2\2\u010e\u010f\7u\2\2\u010f\u0110\7e\2\2\u0110\u0111"+
		"\7g\2\2\u0111\u0112\7p\2\2\u0112\u0113\7f\2\2\u0113\u0114\7c\2\2\u0114"+
		"\u0115\7p\2\2\u0115\u0170\7v\2\2\u0116\u0117\7f\2\2\u0117\u0118\7g\2\2"+
		"\u0118\u0119\7u\2\2\u0119\u011a\7e\2\2\u011a\u011b\7g\2\2\u011b\u011c"+
		"\7p\2\2\u011c\u011d\7f\2\2\u011d\u011e\7c\2\2\u011e\u011f\7p\2\2\u011f"+
		"\u0120\7v\2\2\u0120\u0121\7/\2\2\u0121\u0122\7q\2\2\u0122\u0123\7t\2\2"+
		"\u0123\u0124\7/\2\2\u0124\u0125\7u\2\2\u0125\u0126\7g\2\2\u0126\u0127"+
		"\7n\2\2\u0127\u0170\7h\2\2\u0128\u0129\7h\2\2\u0129\u012a\7q\2\2\u012a"+
		"\u012b\7n\2\2\u012b\u012c\7n\2\2\u012c\u012d\7q\2\2\u012d\u012e\7y\2\2"+
		"\u012e\u012f\7k\2\2\u012f\u0130\7p\2\2\u0130\u0170\7i\2\2\u0131\u0132"+
		"\7h\2\2\u0132\u0133\7q\2\2\u0133\u0134\7n\2\2\u0134\u0135\7n\2\2\u0135"+
		"\u0136\7q\2\2\u0136\u0137\7y\2\2\u0137\u0138\7k\2\2\u0138\u0139\7p\2\2"+
		"\u0139\u013a\7i\2\2\u013a\u013b\7/\2\2\u013b\u013c\7u\2\2\u013c\u013d"+
		"\7k\2\2\u013d\u013e\7d\2\2\u013e\u013f\7n\2\2\u013f\u0140\7k\2\2\u0140"+
		"\u0141\7p\2\2\u0141\u0170\7i\2\2\u0142\u0143\7p\2\2\u0143\u0144\7c\2\2"+
		"\u0144\u0145\7o\2\2\u0145\u0146\7g\2\2\u0146\u0147\7u\2\2\u0147\u0148"+
		"\7r\2\2\u0148\u0149\7c\2\2\u0149\u014a\7e\2\2\u014a\u0170\7g\2\2\u014b"+
		"\u014c\7r\2\2\u014c\u014d\7c\2\2\u014d\u014e\7t\2\2\u014e\u014f\7g\2\2"+
		"\u014f\u0150\7p\2\2\u0150\u0170\7v\2\2\u0151\u0152\7r\2\2\u0152\u0153"+
		"\7t\2\2\u0153\u0154\7g\2\2\u0154\u0155\7e\2\2\u0155\u0156\7g\2\2\u0156"+
		"\u0157\7f\2\2\u0157\u0158\7k\2\2\u0158\u0159\7p\2\2\u0159\u0170\7i\2\2"+
		"\u015a\u015b\7r\2\2\u015b\u015c\7t\2\2\u015c\u015d\7g\2\2\u015d\u015e"+
		"\7e\2\2\u015e\u015f\7g\2\2\u015f\u0160\7f\2\2\u0160\u0161\7k\2\2\u0161"+
		"\u0162\7p\2\2\u0162\u0163\7i\2\2\u0163\u0164\7/\2\2\u0164\u0165\7u\2\2"+
		"\u0165\u0166\7k\2\2\u0166\u0167\7d\2\2\u0167\u0168\7n\2\2\u0168\u0169"+
		"\7k\2\2\u0169\u016a\7p\2\2\u016a\u0170\7i\2\2\u016b\u016c\7u\2\2\u016c"+
		"\u016d\7g\2\2\u016d\u016e\7n\2\2\u016e\u0170\7h\2\2\u016f\u00e6\3\2\2"+
		"\2\u016f\u00ee\3\2\2\2\u016f\u00fe\3\2\2\2\u016f\u0107\3\2\2\2\u016f\u010c"+
		"\3\2\2\2\u016f\u0116\3\2\2\2\u016f\u0128\3\2\2\2\u016f\u0131\3\2\2\2\u016f"+
		"\u0142\3\2\2\2\u016f\u014b\3\2\2\2\u016f\u0151\3\2\2\2\u016f\u015a\3\2"+
		"\2\2\u016f\u016b\3\2\2\2\u0170F\3\2\2\2\u0171\u0175\7$\2\2\u0172\u0174"+
		"\n\2\2\2\u0173\u0172\3\2\2\2\u0174\u0177\3\2\2\2\u0175\u0173\3\2\2\2\u0175"+
		"\u0176\3\2\2\2\u0176\u0178\3\2\2\2\u0177\u0175\3\2\2\2\u0178\u0182\7$"+
		"\2\2\u0179\u017d\7)\2\2\u017a\u017c\n\3\2\2\u017b\u017a\3\2\2\2\u017c"+
		"\u017f\3\2\2\2\u017d\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u0180\3\2"+
		"\2\2\u017f\u017d\3\2\2\2\u0180\u0182\7)\2\2\u0181\u0171\3\2\2\2\u0181"+
		"\u0179\3\2\2\2\u0182H\3\2\2\2\u0183\u0185\t\4\2\2\u0184\u0183\3\2\2\2"+
		"\u0185\u0186\3\2\2\2\u0186\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187J\3"+
		"\2\2\2\u0188\u018c\5M\'\2\u0189\u018b\5O(\2\u018a\u0189\3\2\2\2\u018b"+
		"\u018e\3\2\2\2\u018c\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018dL\3\2\2\2"+
		"\u018e\u018c\3\2\2\2\u018f\u0190\t\5\2\2\u0190N\3\2\2\2\u0191\u0194\5"+
		"M\'\2\u0192\u0194\t\6\2\2\u0193\u0191\3\2\2\2\u0193\u0192\3\2\2\2\u0194"+
		"P\3\2\2\2\17\2\u00d4\u00d9\u00db\u00df\u00e4\u016f\u0175\u017d\u0181\u0186"+
		"\u018c\u0193\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}