/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package typingtutor;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter.DefaultHighlightPainter;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import javax.swing.text.StyledDocument;

/**
 *
 * @author Pooja Patel
 */
public class Practice extends javax.swing.JFrame {

    /**
     * Creates new form Practice
     */
    public String str;
    public int in;
    public static int sec = 0;
    public static float ac = 0;
    public char[] arr;
    public static int le;
    public static float acu;
    public static int wpm;
    public static int time;
    public static float no;
    public static int len;
    public int flag = 0;
    public int flag2 = 0;
    public int fl = 0;
    public char ch = 0;
    public char ch1;
    public String sr;
    Timer timer;

    public void init(int lev) {
        jTextArea1.setLineWrap(true);
        jTextArea1.setWrapStyleWord(true);
        if (lev == 1) {
            str = "as sl l; ;a ssll aassll;; llss ;;llssaa all sass alas sal; lass";
            jTextArea1.append(str);
            arr = str.toCharArray();
            len = str.length();
            tim.setText("0");
            in = 0;
        } else if (lev == 2) {
            str = "df fj jk kd ffjj ffjjkkdd ddffjjkk falls fad asks jas adds flasks; alas a flask falls;";
            jTextArea1.append(str);
            arr = str.toCharArray();
            len = str.length();
            tim.setText("0");
            in = 0;
        } else if (lev == 3) {
            str = "fg jh gh fj ffgghhjj gghh asdfg hjkl; sad dad flag lass asks gal alas flasks salad glad";
            jTextArea1.append(str);
            arr = str.toCharArray();
            len = str.length();
            tim.setText("0");
            in = 0;
        } else if (lev == 4) {
            str = "fg ft jh jy gy ht ffggttjjhhyy shaggy yak fat flask task thy glad lady says last glass sadly flat stall;";
            jTextArea1.append(str);
            arr = str.toCharArray();
            len = str.length();
            tim.setText("0");
            in = 0;
        } else if (lev == 5) {
            str = "de ki ei ddeeiikk kids like salads; lead glad leaks gas lake jelled high hill flash faked kids ask dad feed fish";
            jTextArea1.append(str);
            arr = str.toCharArray();
            len = str.length();
            tim.setText("0");
            in = 0;
        } else if (lev == 6) {
            str = "fr ju de ki dr ku she uses ruler skillfully; judge says that is a truly just rule; their kite flies farthest;";
            jTextArea1.append(str);
            arr = str.toCharArray();
            len = str.length();
            tim.setText("0");
            in = 0;
        } else if (lev == 7) {
            str = "sw lo aq ;p aw ;o look for her; he jogs quite slowly; perhaps those people would work for her; he was too old to jog;";
            jTextArea1.append(str);
            arr = str.toCharArray();
            len = str.length();
            tim.setText("0");
            in = 0;
        } else if (lev == 8) {
            str = "fv fb jn bn mb fvvbbnn wilbur has driven mom home; seven loaves of home baked bread; babies love bubbles; never believe the battle is over until you have done your best";
            jTextArea1.append(str);
            arr = str.toCharArray();
            len = str.length();
            tim.setText("0");
            in = 0;
        } else if (lev == 9) {
            str = "Studying is the main source of knowledge. Books are indeed never failing friends of man. Reading good books ennobles us and broadens our outlook.";
            jTextArea1.append(str);
            arr = str.toCharArray();
            len = str.length();
            tim.setText("0");
            in = 0;
        } else if (lev == 10) {
            str = "India is known for diversity in region, languages, food, clothes, festival, states, diversity in everything which uniquely represents country and its people. India is republic country which is for the people, by the people and from the people.";
            jTextArea1.append(str);
            arr = str.toCharArray();
            len = str.length();
            tim.setText("0");
            in = 0;
        } else if (lev == 11) {
            str = "I hope you have enjoyed this typing course and can now visualize where each letter key is situated on your keyboard and which is the best finger to use for each key. If you can do that you will find you will use less energy, and finish your typing more quickly.";
            jTextArea1.append(str);
            arr = str.toCharArray();
            len = str.length();
            tim.setText("0");
            in = 0;
        }
    }

    void cal() {
        int i;
        char[] arr2;
        String str2;
        float cps, cpm;
        no = jTextArea1.getText().length();
        cps = no / time;
        cpm = cps * 60;
        wpm = (int) (cpm / 5);
        str2 = jTextPane1.getText();
        arr2 = str2.toCharArray();
        for (i = 0; i < no; i++) {
            if (arr[i] == arr2[i]) {
                Practice.ac++;
            }
        }
        acu = (Practice.ac / no) * 100;
        new Display().setVisible(true);
    }

    public Practice() {

        initComponents();
        ac = 0;
        jTextArea1.setEditable(false);
        timer = new Timer(1000, new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                if (flag2 == 0) {
                    sec++;
                    tim.setText("" + sec);
                }

            }
        });

        init(Practice.le);
        q.setBackground(Color.white);
        w.setBackground(Color.white);
        e.setBackground(Color.white);
        r.setBackground(Color.white);
        t.setBackground(Color.white);
        y.setBackground(Color.white);
        u.setBackground(Color.white);
        i.setBackground(Color.white);
        o.setBackground(Color.white);
        p.setBackground(Color.white);
        a.setBackground(Color.white);
        s.setBackground(Color.white);
        d.setBackground(Color.white);
        f.setBackground(Color.white);
        g.setBackground(Color.white);
        h.setBackground(Color.white);
        j.setBackground(Color.white);
        k.setBackground(Color.white);
        l.setBackground(Color.white);
        jButton1.setBackground(Color.white);
        z.setBackground(Color.white);
        x.setBackground(Color.white);
        c.setBackground(Color.white);
        v.setBackground(Color.white);
        b.setBackground(Color.white);
        n.setBackground(Color.white);
        m.setBackground(Color.white);
        jButton2.setBackground(Color.white);
        jButton3.setBackground(Color.white);
        jTextPane1.addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent ev) {

            }

            public void keyPressed(KeyEvent ev) {
                if (flag == 0) {
                    timer.start();
                }
                if (flag2 == 1) {
                    flag2 = 0;
                }
                if (ev.getKeyChar() == 'q' || ev.getKeyChar() == 'Q') {
                    q.setBackground(Color.darkGray);
                } else if (ev.getKeyChar() == 'w' || ev.getKeyChar() == 'W') {
                    w.setBackground(Color.darkGray);
                } else if (ev.getKeyChar() == 'e' || ev.getKeyChar() == 'E') {
                    e.setBackground(Color.darkGray);
                } else if (ev.getKeyChar() == 'r' || ev.getKeyChar() == 'R') {
                    r.setBackground(Color.darkGray);
                } else if (ev.getKeyChar() == 't' || ev.getKeyChar() == 'T') {
                    t.setBackground(Color.darkGray);
                } else if (ev.getKeyChar() == 'y' || ev.getKeyChar() == 'Y') {
                    y.setBackground(Color.darkGray);
                } else if (ev.getKeyChar() == 'u' || ev.getKeyChar() == 'U') {
                    u.setBackground(Color.darkGray);
                } else if (ev.getKeyChar() == 'i' || ev.getKeyChar() == 'I') {
                    i.setBackground(Color.darkGray);
                } else if (ev.getKeyChar() == 'o' || ev.getKeyChar() == 'O') {
                    o.setBackground(Color.darkGray);
                } else if (ev.getKeyChar() == 'p' || ev.getKeyChar() == 'P') {
                    p.setBackground(Color.darkGray);
                } else if (ev.getKeyChar() == 'a' || ev.getKeyChar() == 'A') {
                    a.setBackground(Color.darkGray);
                } else if (ev.getKeyChar() == 's' || ev.getKeyChar() == 'S') {
                    s.setBackground(Color.darkGray);
                } else if (ev.getKeyChar() == 'd' || ev.getKeyChar() == 'D') {
                    d.setBackground(Color.darkGray);
                } else if (ev.getKeyChar() == 'f' || ev.getKeyChar() == 'F') {
                    f.setBackground(Color.darkGray);
                } else if (ev.getKeyChar() == 'g' || ev.getKeyChar() == 'G') {
                    g.setBackground(Color.darkGray);
                } else if (ev.getKeyChar() == 'h' || ev.getKeyChar() == 'H') {
                    h.setBackground(Color.darkGray);
                } else if (ev.getKeyChar() == 'j' || ev.getKeyChar() == 'J') {
                    j.setBackground(Color.darkGray);
                } else if (ev.getKeyChar() == 'k' || ev.getKeyChar() == 'K') {
                    k.setBackground(Color.darkGray);
                } else if (ev.getKeyChar() == 'l' || ev.getKeyChar() == 'L') {
                    l.setBackground(Color.darkGray);
                } else if (ev.getKeyChar() == ';') {
                    jButton1.setBackground(Color.darkGray);
                } else if (ev.getKeyChar() == 'z' || ev.getKeyChar() == 'Z') {
                    z.setBackground(Color.darkGray);
                } else if (ev.getKeyChar() == 'x' || ev.getKeyChar() == 'X') {
                    x.setBackground(Color.darkGray);
                } else if (ev.getKeyChar() == 'c' || ev.getKeyChar() == 'C') {
                    c.setBackground(Color.darkGray);
                } else if (ev.getKeyChar() == 'v' || ev.getKeyChar() == 'V') {
                    v.setBackground(Color.darkGray);
                } else if (ev.getKeyChar() == 'b' || ev.getKeyChar() == 'B') {
                    b.setBackground(Color.darkGray);
                } else if (ev.getKeyChar() == 'n' || ev.getKeyChar() == 'N') {
                    n.setBackground(Color.darkGray);
                } else if (ev.getKeyChar() == 'm' || ev.getKeyChar() == 'M') {
                    m.setBackground(Color.darkGray);
                } else if (ev.getKeyChar() == ',') {
                    jButton2.setBackground(Color.darkGray);
                } else if (ev.getKeyChar() == '.') {
                    jButton3.setBackground(Color.darkGray);
                } else if (ev.getKeyCode() == KeyEvent.VK_SPACE) {
                    jButton5.setBackground(Color.darkGray);

                } else if (ev.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    in--;

                }
            }

            public void keyReleased(KeyEvent ev) {
                if (ev.getKeyChar() == 'q' || ev.getKeyChar() == 'Q') {
                    q.setBackground(Color.white);
                    call();
                } else if (ev.getKeyChar() == 'w' || ev.getKeyChar() == 'W') {
                    w.setBackground(Color.white);
                    call();
                } else if (ev.getKeyChar() == 'e' || ev.getKeyChar() == 'E') {
                    e.setBackground(Color.white);
                    call();
                } else if (ev.getKeyChar() == 'r' || ev.getKeyChar() == 'R') {
                    r.setBackground(Color.white);
                    call();
                } else if (ev.getKeyChar() == 't' || ev.getKeyChar() == 'T') {
                    t.setBackground(Color.white);
                    call();
                } else if (ev.getKeyChar() == 'y' || ev.getKeyChar() == 'Y') {
                    y.setBackground(Color.white);
                    call();
                } else if (ev.getKeyChar() == 'u' || ev.getKeyChar() == 'U') {
                    u.setBackground(Color.white);
                    call();
                } else if (ev.getKeyChar() == 'i' || ev.getKeyChar() == 'I') {
                    i.setBackground(Color.white);
                    call();
                } else if (ev.getKeyChar() == 'o' || ev.getKeyChar() == 'O') {
                    o.setBackground(Color.white);
                    call();
                } else if (ev.getKeyChar() == 'p' || ev.getKeyChar() == 'P') {
                    p.setBackground(Color.white);
                    call();
                } else if (ev.getKeyChar() == 'a' || ev.getKeyChar() == 'A') {
                    a.setBackground(Color.white);
                    call();
                } else if (ev.getKeyChar() == 's' || ev.getKeyChar() == 'S') {
                    s.setBackground(Color.white);
                    call();
                } else if (ev.getKeyChar() == 'd' || ev.getKeyChar() == 'D') {
                    d.setBackground(Color.white);
                    call();
                } else if (ev.getKeyChar() == 'f' || ev.getKeyChar() == 'F') {
                    f.setBackground(Color.white);
                    call();
                } else if (ev.getKeyChar() == 'g' || ev.getKeyChar() == 'G') {
                    g.setBackground(Color.white);
                    call();
                } else if (ev.getKeyChar() == 'h' || ev.getKeyChar() == 'H') {
                    h.setBackground(Color.white);
                    call();
                } else if (ev.getKeyChar() == 'j' || ev.getKeyChar() == 'J') {
                    j.setBackground(Color.white);
                    call();
                } else if (ev.getKeyChar() == 'k' || ev.getKeyChar() == 'K') {
                    k.setBackground(Color.white);
                    call();
                } else if (ev.getKeyChar() == 'l' || ev.getKeyChar() == 'L') {
                    l.setBackground(Color.white);
                    call();
                } else if (ev.getKeyChar() == ';') {
                    jButton1.setBackground(Color.white);
                    call();
                } else if (ev.getKeyChar() == 'z' || ev.getKeyChar() == 'Z') {
                    z.setBackground(Color.white);
                    call();
                } else if (ev.getKeyChar() == 'x' || ev.getKeyChar() == 'X') {
                    x.setBackground(Color.white);
                    call();
                } else if (ev.getKeyChar() == 'c' || ev.getKeyChar() == 'C') {
                    c.setBackground(Color.white);
                    call();
                } else if (ev.getKeyChar() == 'v' || ev.getKeyChar() == 'V') {
                    v.setBackground(Color.white);
                    call();
                } else if (ev.getKeyChar() == 'b' || ev.getKeyChar() == 'B') {
                    b.setBackground(Color.white);
                    call();
                } else if (ev.getKeyChar() == 'n' || ev.getKeyChar() == 'N') {
                    n.setBackground(Color.white);
                    call();
                } else if (ev.getKeyChar() == 'm' || ev.getKeyChar() == 'M') {
                    m.setBackground(Color.white);
                    call();
                } else if (ev.getKeyChar() == ',') {
                    jButton2.setBackground(Color.white);
                    call();
                } else if (ev.getKeyChar() == '.') {
                    jButton3.setBackground(Color.white);
                    call();
                } else if (ev.getKeyCode() == KeyEvent.VK_SPACE) {
                    jButton5.setBackground(Color.white);
                    call();
                } else if (ev.getKeyCode() == KeyEvent.VK_BACK_SPACE) {

                }

            }
        });

    }

    void appendToPane(JTextPane JTextPane1, String msg, Color c) {
        StyleContext sc = StyleContext.getDefaultStyleContext();
        AttributeSet aset = sc.addAttribute(SimpleAttributeSet.EMPTY, StyleConstants.Foreground, c);
        int len = jTextPane1.getDocument().getLength();
        jTextPane1.setCaretPosition(len);
        jTextPane1.setCharacterAttributes(aset, false);
        jTextPane1.replaceSelection(msg);
    }

    void append(JTextPane JTextPane1, String msg, Color c) {
        int n = jTextPane1.getDocument().getLength();
        DefaultHighlightPainter d = new DefaultHighlightPainter(c);
        try {
            jTextPane1.setText(jTextPane1.getText() + msg);
            jTextPane1.getHighlighter().addHighlight(n, n + 1, d);
        } catch (BadLocationException ex) {
            ex.printStackTrace();
        }

    }

    void append1(JTextPane jTextPane1, String msg, Color c) {
        SimpleAttributeSet aset = new SimpleAttributeSet();
        StyleConstants.setForeground(aset, c);
        int len = jTextPane1.getText().length();
        jTextPane1.setCaretPosition(len);
        jTextPane1.setCharacterAttributes(aset, false);
        jTextPane1.replaceSelection(msg);
    }

    void append2(JTextPane jTextPane1, String msg, Color c) {
        SimpleAttributeSet attrs = new SimpleAttributeSet();
        StyleConstants.setForeground(attrs, c);
        StyledDocument sdoc = jTextPane1.getStyledDocument();
        jTextPane1.setText(jTextPane1.getText() + msg);
        sdoc.setCharacterAttributes(0, jTextPane1.getDocument().getLength() + 1, attrs, false);
    }

    void call() {

        ch1 = jTextPane1.getText().charAt(jTextPane1.getText().length() - 1);
        jTextPane1.setText(jTextPane1.getText().substring(0, jTextPane1.getText().length() - 1));
        ch = arr[in];
        sr = Character.toString(ch1);
        if (ch == ch1) {
            append(jTextPane1, sr, Color.yellow);
        } else {
            append(jTextPane1, sr, Color.cyan);
        }
        in++;
        if (in == len) {
            timer.stop();
            time = Integer.valueOf(tim.getText());
            cal();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        a = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        s = new javax.swing.JButton();
        d = new javax.swing.JButton();
        f = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        g = new javax.swing.JButton();
        h = new javax.swing.JButton();
        j = new javax.swing.JButton();
        k = new javax.swing.JButton();
        l = new javax.swing.JButton();
        q = new javax.swing.JButton();
        w = new javax.swing.JButton();
        e = new javax.swing.JButton();
        r = new javax.swing.JButton();
        t = new javax.swing.JButton();
        y = new javax.swing.JButton();
        u = new javax.swing.JButton();
        i = new javax.swing.JButton();
        o = new javax.swing.JButton();
        p = new javax.swing.JButton();
        z = new javax.swing.JButton();
        x = new javax.swing.JButton();
        c = new javax.swing.JButton();
        v = new javax.swing.JButton();
        b = new javax.swing.JButton();
        n = new javax.swing.JButton();
        m = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tim = new javax.swing.JLabel();
        finish = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        a.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        a.setText("a");
        a.setMaximumSize(new java.awt.Dimension(40, 40));
        a.setMinimumSize(new java.awt.Dimension(40, 40));
        a.setPreferredSize(new java.awt.Dimension(45, 45));
        a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        s.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s.setText("s");
        s.setPreferredSize(new java.awt.Dimension(45, 45));
        s.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sActionPerformed(evt);
            }
        });

        d.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        d.setText("d");
        d.setPreferredSize(new java.awt.Dimension(45, 45));

        f.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        f.setText("f");
        f.setPreferredSize(new java.awt.Dimension(45, 45));

        jTextPane1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jScrollPane3.setViewportView(jTextPane1);

        g.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        g.setText("g");
        g.setPreferredSize(new java.awt.Dimension(45, 45));

        h.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        h.setText("h");
        h.setPreferredSize(new java.awt.Dimension(45, 45));

        j.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        j.setText("j");
        j.setPreferredSize(new java.awt.Dimension(45, 45));

        k.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        k.setText("k");
        k.setPreferredSize(new java.awt.Dimension(45, 45));

        l.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        l.setText("l");
        l.setPreferredSize(new java.awt.Dimension(45, 45));

        q.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        q.setText("q");
        q.setPreferredSize(new java.awt.Dimension(55, 55));

        w.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        w.setText("w");
        w.setPreferredSize(new java.awt.Dimension(55, 55));

        e.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        e.setText("e");
        e.setPreferredSize(new java.awt.Dimension(55, 55));

        r.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        r.setText("r");
        r.setPreferredSize(new java.awt.Dimension(55, 55));
        r.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rActionPerformed(evt);
            }
        });

        t.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        t.setText("t");
        t.setPreferredSize(new java.awt.Dimension(55, 55));

        y.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        y.setText("y");
        y.setPreferredSize(new java.awt.Dimension(45, 45));

        u.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        u.setText("u");
        u.setPreferredSize(new java.awt.Dimension(45, 45));

        i.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        i.setText("i");
        i.setPreferredSize(new java.awt.Dimension(45, 45));

        o.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        o.setText("o");
        o.setPreferredSize(new java.awt.Dimension(45, 45));

        p.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        p.setText("p");
        p.setPreferredSize(new java.awt.Dimension(45, 45));

        z.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        z.setText("z");
        z.setPreferredSize(new java.awt.Dimension(55, 55));

        x.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        x.setText("x");

        c.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        c.setText("c");

        v.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        v.setText("v");

        b.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        b.setText("b");

        n.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        n.setText("n");
        n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nActionPerformed(evt);
            }
        });

        m.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        m.setText("m");

        jLabel1.setText("Time:");

        tim.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        finish.setText("Finish");
        finish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setText(";");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2.setText(",");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton3.setText(".");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Pause");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tim, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane1))
                .addGap(197, 197, 197))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(finish, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(250, 250, 250)
                            .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(s, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(f, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(g, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(h, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(j, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(k, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(l, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(286, 286, 286)
                                    .addComponent(z, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(x, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(v, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(19, 19, 19)
                                    .addComponent(n, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(m, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(24, 24, 24)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(18, 18, 18)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(q, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(w, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(e, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(r, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(t, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(y, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(u, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(i, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(o, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(p, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(244, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tim, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(77, 77, 77)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(q, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(w, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(e, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(r, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(y, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(u, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(i, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(o, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(finish, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(98, 98, 98)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(s, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(h, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(k, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(x, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(v, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aActionPerformed

    private void sActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sActionPerformed

    private void rActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rActionPerformed

    private void finishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finishActionPerformed
        timer.stop();
        time = Integer.valueOf(tim.getText());
        cal();// TODO add your handling code here:
    }//GEN-LAST:event_finishActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        flag2 = 1;        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Practice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Practice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Practice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Practice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Practice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton a;
    private javax.swing.JButton b;
    private javax.swing.JButton c;
    private javax.swing.JButton d;
    private javax.swing.JButton e;
    private javax.swing.JButton f;
    private javax.swing.JButton finish;
    private javax.swing.JButton g;
    private javax.swing.JButton h;
    private javax.swing.JButton i;
    private javax.swing.JButton j;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JButton k;
    private javax.swing.JButton l;
    private javax.swing.JButton m;
    private javax.swing.JButton n;
    private javax.swing.JButton o;
    private javax.swing.JButton p;
    private javax.swing.JButton q;
    private javax.swing.JButton r;
    private javax.swing.JButton s;
    private javax.swing.JButton t;
    private javax.swing.JLabel tim;
    private javax.swing.JButton u;
    private javax.swing.JButton v;
    private javax.swing.JButton w;
    private javax.swing.JButton x;
    private javax.swing.JButton y;
    private javax.swing.JButton z;
    // End of variables declaration//GEN-END:variables
}
