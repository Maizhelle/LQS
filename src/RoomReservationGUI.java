import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class RoomReservationGUI extends javax.swing.JFrame {
    private LibraryManager libraryManager;

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(RoomReservationGUI.class.getName());

    private javax.swing.JPanel pnlLeftColumn;
    private javax.swing.JPanel pnlStudentDetails;
    private javax.swing.JLabel lblStudentName;
    private java.awt.TextField txtStudentName;
    private javax.swing.JLabel lblStudentID;
    private java.awt.TextField txtStudentID;
    private javax.swing.JLabel lblDate;
    private java.awt.TextField txtDate;
    private javax.swing.JLabel lblStartTime;
    private javax.swing.JComboBox<String> cmbStartTime;
    private javax.swing.JLabel lblDuration;
    private javax.swing.JComboBox<String> cmbDuration;
    private javax.swing.JLabel lblHeadcount;
    private java.awt.TextField txtHeadcount;
    private javax.swing.JLabel lblRoomSelection;
    private javax.swing.JComboBox<String> cmbRoomSelection;
    private javax.swing.JButton btnReserve;

    private javax.swing.JPanel pnlReservationDetails;
    private javax.swing.JLabel lblReservationCodeTitle;
    private javax.swing.JLabel lblOutputReservationCode;
    private javax.swing.JLabel lblOutputStudentNameTitle;
    private javax.swing.JLabel lblOutputStudentName;
    private javax.swing.JLabel lblOutputDateTitle;
    private javax.swing.JLabel lblOutputDate;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblOutputTime;
    private javax.swing.JLabel lblOutputDurationTitle;
    private javax.swing.JLabel lblOutputDuration;
    private javax.swing.JLabel lblOutputHeadcountTitle;
    private javax.swing.JLabel lblOutputHeadcount;
    private javax.swing.JLabel lblOutputStatusTitle;
    private javax.swing.JLabel lblOutputStatus;
    private javax.swing.JButton btnDone;

    private javax.swing.JPanel pnlRoomsContainer;
    private javax.swing.JScrollPane scrollRooms;
    
    // ROOM 1
    private javax.swing.JPanel pnlRoom1Outer;
    private javax.swing.JLabel lblRoom1Title;
    private javax.swing.JButton btnRemoveRoom1;
    private javax.swing.JScrollPane scrollRoom1;
    private javax.swing.JPanel pnlRoom1Content;
    private javax.swing.JLabel lblRoom1NumberTitle;
    private javax.swing.JLabel lblRoom1Number;
    private javax.swing.JLabel lblRoom1Reservation;
    private javax.swing.JLabel lblRoom1Code;
    private javax.swing.JLabel lblRoom1CheckInTitle;
    private javax.swing.JLabel lblRoom1CheckIn;
    private javax.swing.JLabel lblRoom1TimerTitle;
    private javax.swing.JLabel lblRoom1Timer;

    // ROOM 2
    private javax.swing.JPanel pnlRoom2Outer;
    private javax.swing.JLabel lblRoom2Title;
    private javax.swing.JButton btnRemoveRoom2;
    private javax.swing.JScrollPane scrollRoom2;
    private javax.swing.JPanel pnlRoom2Content;
    private javax.swing.JLabel lblRoom2NumberTitle;
    private javax.swing.JLabel lblRoom2Number;
    private javax.swing.JLabel lblRoom2Reservation;
    private javax.swing.JLabel lblRoom2Code;
    private javax.swing.JLabel lblRoom2CheckInTitle;
    private javax.swing.JLabel lblRoom2CheckIn;
    private javax.swing.JLabel lblRoom2TimerTitle;
    private javax.swing.JLabel lblRoom2Timer;

    // ROOM 3
    private javax.swing.JPanel pnlRoom3Outer;
    private javax.swing.JLabel lblRoom3Title;
    private javax.swing.JButton btnRemoveRoom3;
    private javax.swing.JScrollPane scrollRoom3;
    private javax.swing.JPanel pnlRoom3Content;
    private javax.swing.JLabel lblRoom3NumberTitle;
    private javax.swing.JLabel lblRoom3Number;
    private javax.swing.JLabel lblRoom3Reservation;
    private javax.swing.JLabel lblRoom3Code;
    private javax.swing.JLabel lblRoom3CheckInTitle;
    private javax.swing.JLabel lblRoom3CheckIn;
    private javax.swing.JLabel lblRoom3TimerTitle;
    private javax.swing.JLabel lblRoom3Timer;

    private javax.swing.JPanel pnlRoom4Outer;
    private javax.swing.JLabel lblRoom4Title;
    private javax.swing.JButton btnRemoveRoom4;
    private javax.swing.JScrollPane scrollRoom4;
    private javax.swing.JPanel pnlRoom4Content;
    private javax.swing.JLabel lblRoom4Reservation;
    private javax.swing.JLabel lblRoom4CheckInTitle;
    private javax.swing.JLabel lblRoom4TimerTitle;
    private javax.swing.JLabel lblRoom4Code;
    private javax.swing.JLabel lblRoom4CheckIn;
    private javax.swing.JLabel lblRoom4Timer;

    private javax.swing.JPanel pnlRoom5Outer;
    private javax.swing.JLabel lblRoom5Title;
    private javax.swing.JScrollPane scrollRoom5;
    private javax.swing.JPanel pnlRoom5Content;
    private javax.swing.JLabel lblRoom5Reservation;
    private javax.swing.JLabel lblRoom5CheckInTitle;
    private javax.swing.JLabel lblRoom5TimerTitle;
    private javax.swing.JLabel lblRoom5Code;
    private javax.swing.JLabel lblRoom5CheckIn;
    private javax.swing.JLabel lblRoom5Timer;
    private final Map<Integer, Long> roomEndTimes = new HashMap<>();
    private javax.swing.Timer countdownTimer;

    public RoomReservationGUI() {
        initComponents();

        libraryManager = new LibraryManager();
        initControllerActions();
        countdownTimer = new javax.swing.Timer(1000, e -> updateRoomTimers());
        countdownTimer.start();
        addQueueClickHandler(lblRoom1Code, 1);
        addQueueClickHandler(lblRoom2Code, 2);
        addQueueClickHandler(lblRoom3Code, 3);
        addQueueClickHandler(lblRoom4Code, 4);
        addQueueClickHandler(lblRoom5Code, 5);
    }

    private void initComponents() {

        pnlLeftColumn = new javax.swing.JPanel();
        pnlStudentDetails = new javax.swing.JPanel();
        lblStudentName = new javax.swing.JLabel();
        txtStudentName = new java.awt.TextField();
        lblStudentID = new javax.swing.JLabel();
        txtStudentID = new java.awt.TextField();
        lblDate = new javax.swing.JLabel();
        txtDate = new java.awt.TextField();
        lblStartTime = new javax.swing.JLabel();
        cmbStartTime = new javax.swing.JComboBox<>();
        lblDuration = new javax.swing.JLabel();
        cmbDuration = new javax.swing.JComboBox<>();
        lblHeadcount = new javax.swing.JLabel();
        txtHeadcount = new java.awt.TextField();
        lblRoomSelection = new javax.swing.JLabel();
        cmbRoomSelection = new javax.swing.JComboBox<>();
        btnReserve = new javax.swing.JButton();

        pnlReservationDetails = new javax.swing.JPanel();
        lblReservationCodeTitle = new javax.swing.JLabel();
        lblOutputReservationCode = new javax.swing.JLabel();
        lblOutputStudentNameTitle = new javax.swing.JLabel();
        lblOutputStudentName = new javax.swing.JLabel();
        lblOutputDateTitle = new javax.swing.JLabel();
        lblOutputDate = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        lblOutputTime = new javax.swing.JLabel();
        lblOutputDurationTitle = new javax.swing.JLabel();
        lblOutputDuration = new javax.swing.JLabel();
        lblOutputHeadcountTitle = new javax.swing.JLabel();
        lblOutputHeadcount = new javax.swing.JLabel();
        lblOutputStatusTitle = new javax.swing.JLabel();
        lblOutputStatus = new javax.swing.JLabel();
        btnDone = new javax.swing.JButton();

        pnlRoomsContainer = new javax.swing.JPanel();
        
        // ROOM 1 with ScrollPane
        pnlRoom1Outer = new javax.swing.JPanel();
        lblRoom1Title = new javax.swing.JLabel();
        btnRemoveRoom1 = new javax.swing.JButton();
        scrollRoom1 = new javax.swing.JScrollPane();
        pnlRoom1Content = new javax.swing.JPanel();
        lblRoom1NumberTitle = new javax.swing.JLabel();
        lblRoom1Number = new javax.swing.JLabel();
        lblRoom1Reservation = new javax.swing.JLabel();
        lblRoom1Code = new javax.swing.JLabel();
        lblRoom1CheckInTitle = new javax.swing.JLabel();
        lblRoom1CheckIn = new javax.swing.JLabel();
        lblRoom1TimerTitle = new javax.swing.JLabel();
        lblRoom1Timer = new javax.swing.JLabel();

        // ROOM 2 with ScrollPane
        pnlRoom2Outer = new javax.swing.JPanel();
        lblRoom2Title = new javax.swing.JLabel();
        btnRemoveRoom2 = new javax.swing.JButton();
        scrollRoom2 = new javax.swing.JScrollPane();
        pnlRoom2Content = new javax.swing.JPanel();
        lblRoom2NumberTitle = new javax.swing.JLabel();
        lblRoom2Number = new javax.swing.JLabel();
        lblRoom2Reservation = new javax.swing.JLabel();
        lblRoom2Code = new javax.swing.JLabel();
        lblRoom2CheckInTitle = new javax.swing.JLabel();
        lblRoom2CheckIn = new javax.swing.JLabel();
        lblRoom2TimerTitle = new javax.swing.JLabel();
        lblRoom2Timer = new javax.swing.JLabel();

        // ROOM 3 with ScrollPane
        pnlRoom3Outer = new javax.swing.JPanel();
        lblRoom3Title = new javax.swing.JLabel();
        btnRemoveRoom3 = new javax.swing.JButton();
        scrollRoom3 = new javax.swing.JScrollPane();
        pnlRoom3Content = new javax.swing.JPanel();
        lblRoom3NumberTitle = new javax.swing.JLabel();
        lblRoom3Number = new javax.swing.JLabel();
        lblRoom3Reservation = new javax.swing.JLabel();
        lblRoom3Code = new javax.swing.JLabel();
        lblRoom3CheckInTitle = new javax.swing.JLabel();
        lblRoom3CheckIn = new javax.swing.JLabel();
        lblRoom3TimerTitle = new javax.swing.JLabel();
        lblRoom3Timer = new javax.swing.JLabel();

        pnlRoom4Outer = new javax.swing.JPanel();
        lblRoom4Title = new javax.swing.JLabel();
        btnRemoveRoom4 = new javax.swing.JButton();
        scrollRoom4 = new javax.swing.JScrollPane();
        pnlRoom4Content = new javax.swing.JPanel();
        lblRoom4Reservation = new javax.swing.JLabel();
        lblRoom4CheckInTitle = new javax.swing.JLabel();
        lblRoom4TimerTitle = new javax.swing.JLabel();
        lblRoom4Code = new javax.swing.JLabel();
        lblRoom4CheckIn = new javax.swing.JLabel();
        lblRoom4Timer = new javax.swing.JLabel();

        pnlRoom5Outer = new javax.swing.JPanel();
        lblRoom5Title = new javax.swing.JLabel();
        scrollRoom5 = new javax.swing.JScrollPane();
        pnlRoom5Content = new javax.swing.JPanel();
        lblRoom5Reservation = new javax.swing.JLabel();
        lblRoom5CheckInTitle = new javax.swing.JLabel();
        lblRoom5TimerTitle = new javax.swing.JLabel();
        lblRoom5Code = new javax.swing.JLabel();
        lblRoom5CheckIn = new javax.swing.JLabel();
        lblRoom5Timer = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ROOM RESERVATION SYSTEM");

        // --- STUDENT DETAILS PANEL ---
        pnlStudentDetails.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Student Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bahnschrift", 1, 20)));

        lblStudentName.setFont(new java.awt.Font("Segoe UI", 1, 14));
        lblStudentName.setText("Student Name");

        lblStudentID.setFont(new java.awt.Font("Segoe UI", 1, 14));
        lblStudentID.setText("Student ID");

        lblDate.setFont(new java.awt.Font("Segoe UI", 1, 14));
        lblDate.setText("Date (MM/DD/YYYY)");

        lblStartTime.setFont(new java.awt.Font("Segoe UI", 1, 14));
        lblStartTime.setText("Start Time");

        cmbStartTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "7:00 AM", "7:30 AM", "8:00 AM", "8:30 AM", "9:00 AM", "9:30 AM", "10:00 AM", "10:30 AM", "11:00 AM", "11:30 AM", "12:00 PM", "12:30 PM", "1:00 PM", "1:30 PM", "2:00 PM", "2:30 PM", "3:00 PM", "3:30 PM", "4:00 PM", "4:30 PM", "5:00 PM" }));

        lblDuration.setFont(new java.awt.Font("Segoe UI", 1, 14));
        lblDuration.setText("Duration");

        cmbDuration.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 Hour", "2 Hours", "3 Hours" }));

        lblHeadcount.setFont(new java.awt.Font("Segoe UI", 1, 14));
        lblHeadcount.setText("Number of Students");

        txtHeadcount.setText("1");

        lblRoomSelection.setFont(new java.awt.Font("Segoe UI", 1, 14));
        lblRoomSelection.setText("Room");

        cmbRoomSelection.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Room 1", "Room 2", "Room 3", "Research Room", "Multimedia Room" }));

        btnReserve.setBackground(new java.awt.Color(0, 0, 255));
        btnReserve.setFont(new java.awt.Font("Segoe UI", 1, 16));
        btnReserve.setForeground(new java.awt.Color(255, 255, 255));
        btnReserve.setText("RESERVE");

        javax.swing.GroupLayout pnlStudentDetailsLayout = new javax.swing.GroupLayout(pnlStudentDetails);
        pnlStudentDetails.setLayout(pnlStudentDetailsLayout);
        pnlStudentDetailsLayout.setHorizontalGroup(
            pnlStudentDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlStudentDetailsLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlStudentDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblStudentName)
                    .addComponent(lblStudentID)
                    .addComponent(lblDate)
                    .addComponent(lblStartTime)
                    .addComponent(lblDuration)
                    .addComponent(lblHeadcount)
                    .addComponent(lblRoomSelection))
                .addGap(30, 30, 30)
                .addGroup(pnlStudentDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtStudentName, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(txtStudentID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbStartTime, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbDuration, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtHeadcount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbRoomSelection, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlStudentDetailsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnReserve, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
        );
        pnlStudentDetailsLayout.setVerticalGroup(
            pnlStudentDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlStudentDetailsLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnlStudentDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblStudentName)
                    .addComponent(txtStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(pnlStudentDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblStudentID)
                    .addComponent(txtStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(pnlStudentDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDate)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(pnlStudentDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStartTime)
                    .addComponent(cmbStartTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(pnlStudentDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDuration)
                    .addComponent(cmbDuration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(pnlStudentDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHeadcount)
                    .addComponent(txtHeadcount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(pnlStudentDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRoomSelection)
                    .addComponent(cmbRoomSelection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnReserve, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        // --- RESERVATION DETAILS PANEL ---
        pnlReservationDetails.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Reservation Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bahnschrift", 1, 20)));

        lblReservationCodeTitle.setFont(new java.awt.Font("Segoe UI", 1, 14));
        lblReservationCodeTitle.setText("Reservation Code");

        lblOutputReservationCode.setFont(new java.awt.Font("Segoe UI", 1, 14));
        lblOutputReservationCode.setForeground(new java.awt.Color(51, 153, 0));
        lblOutputReservationCode.setText("---");

        lblOutputStudentNameTitle.setFont(new java.awt.Font("Segoe UI", 1, 14));
        lblOutputStudentNameTitle.setText("Student Name");

        lblOutputStudentName.setText("---");

        lblOutputDateTitle.setFont(new java.awt.Font("Segoe UI", 1, 14));
        lblOutputDateTitle.setText("Date");

        lblOutputDate.setText("---");

        lblTime.setFont(new java.awt.Font("Segoe UI", 1, 14));
        lblTime.setText("Time");

        lblOutputTime.setText("---");

        lblOutputDurationTitle.setFont(new java.awt.Font("Segoe UI", 1, 14));
        lblOutputDurationTitle.setText("Duration");

        lblOutputDuration.setText("---");

        lblOutputHeadcountTitle.setFont(new java.awt.Font("Segoe UI", 1, 14));
        lblOutputHeadcountTitle.setText("Students");

        lblOutputHeadcount.setText("---");

        lblOutputStatusTitle.setFont(new java.awt.Font("Segoe UI", 1, 14));
        lblOutputStatusTitle.setText("Status");

        lblOutputStatus.setText("---");

        btnDone.setBackground(new java.awt.Color(0, 153, 0));
        btnDone.setFont(new java.awt.Font("Segoe UI", 1, 16));
        btnDone.setForeground(new java.awt.Color(255, 255, 255));
        btnDone.setText("DONE");

        javax.swing.GroupLayout pnlReservationDetailsLayout = new javax.swing.GroupLayout(pnlReservationDetails);
        pnlReservationDetails.setLayout(pnlReservationDetailsLayout);
        pnlReservationDetailsLayout.setHorizontalGroup(
            pnlReservationDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlReservationDetailsLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlReservationDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblReservationCodeTitle)
                    .addComponent(lblOutputStudentNameTitle)
                    .addComponent(lblOutputDateTitle)
                    .addComponent(lblTime)
                    .addComponent(lblOutputDurationTitle)
                    .addComponent(lblOutputHeadcountTitle)
                    .addComponent(lblOutputStatusTitle))
                .addGap(30, 30, 30)
                .addGroup(pnlReservationDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblOutputReservationCode, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(lblOutputStudentName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblOutputDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblOutputTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblOutputDuration, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblOutputHeadcount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblOutputStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlReservationDetailsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDone, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
        );
        pnlReservationDetailsLayout.setVerticalGroup(
            pnlReservationDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlReservationDetailsLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnlReservationDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblReservationCodeTitle)
                    .addComponent(lblOutputReservationCode))
                .addGap(14, 14, 14)
                .addGroup(pnlReservationDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOutputStudentNameTitle)
                    .addComponent(lblOutputStudentName))
                .addGap(14, 14, 14)
                .addGroup(pnlReservationDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOutputDateTitle)
                    .addComponent(lblOutputDate))
                .addGap(14, 14, 14)
                .addGroup(pnlReservationDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTime)
                    .addComponent(lblOutputTime))
                .addGap(14, 14, 14)
                .addGroup(pnlReservationDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOutputDurationTitle)
                    .addComponent(lblOutputDuration))
                .addGap(14, 14, 14)
                .addGroup(pnlReservationDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOutputHeadcountTitle)
                    .addComponent(lblOutputHeadcount))
                .addGap(14, 14, 14)
                .addGroup(pnlReservationDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOutputStatusTitle)
                    .addComponent(lblOutputStatus))
                .addGap(18, 18, 18)
                .addComponent(btnDone, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        // --- LEFT COLUMN WRAPPER ---
        javax.swing.GroupLayout pnlLeftColumnLayout = new javax.swing.GroupLayout(pnlLeftColumn);
        pnlLeftColumn.setLayout(pnlLeftColumnLayout);
        pnlLeftColumnLayout.setHorizontalGroup(
            pnlLeftColumnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLeftColumnLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlLeftColumnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlStudentDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlReservationDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlLeftColumnLayout.setVerticalGroup(
            pnlLeftColumnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLeftColumnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlStudentDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlReservationDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        // --- ROOMS PANEL CONTAINER ---
        pnlRoomsContainer.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Rooms", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bahnschrift", 1, 24)));

        // --- ROOM 1 (Initialized with "---") ---
        pnlRoom1Outer.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18)));

        lblRoom1Title.setFont(new java.awt.Font("Segoe UI", 1, 20));
        lblRoom1Title.setForeground(new java.awt.Color(204, 153, 0));
        lblRoom1Title.setText("ROOM 1");

        btnRemoveRoom1.setBackground(new java.awt.Color(153, 0, 0));
        btnRemoveRoom1.setFont(new java.awt.Font("Segoe UI", 1, 18));
        btnRemoveRoom1.setForeground(new java.awt.Color(255, 255, 255));
        btnRemoveRoom1.setText("-");

        scrollRoom1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);

        lblRoom1NumberTitle.setFont(new java.awt.Font("Segoe UI", 1, 14));
        lblRoom1NumberTitle.setText("Room #:");

        lblRoom1Number.setText("---");
        lblRoom1NumberTitle.setVisible(false);
        lblRoom1Number.setVisible(false);

        lblRoom1Reservation.setFont(new java.awt.Font("Segoe UI", 1, 14));
        lblRoom1Reservation.setText("Reservation Code:");

        lblRoom1Code.setText("---");

        lblRoom1CheckInTitle.setFont(new java.awt.Font("Segoe UI", 1, 14));
        lblRoom1CheckInTitle.setText("Checked In:");

        lblRoom1CheckIn.setText("---");

        lblRoom1TimerTitle.setFont(new java.awt.Font("Segoe UI", 1, 14));
        lblRoom1TimerTitle.setText("Time Remaining:");

        lblRoom1Timer.setText("---");

        javax.swing.GroupLayout pnlRoom1ContentLayout = new javax.swing.GroupLayout(pnlRoom1Content);
        pnlRoom1Content.setLayout(pnlRoom1ContentLayout);
        pnlRoom1ContentLayout.setHorizontalGroup(
            pnlRoom1ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRoom1ContentLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pnlRoom1ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRoom1NumberTitle)
                    .addComponent(lblRoom1Reservation)
                    .addComponent(lblRoom1CheckInTitle)
                    .addComponent(lblRoom1TimerTitle))
                .addGap(86, 86, 86)
                .addGroup(pnlRoom1ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRoom1Timer)
                    .addComponent(lblRoom1CheckIn)
                    .addComponent(lblRoom1Code)
                    .addComponent(lblRoom1Number))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        pnlRoom1ContentLayout.setVerticalGroup(
            pnlRoom1ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRoom1ContentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlRoom1ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRoom1NumberTitle)
                    .addComponent(lblRoom1Number))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlRoom1ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRoom1Reservation)
                    .addComponent(lblRoom1Code))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlRoom1ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRoom1CheckInTitle)
                    .addComponent(lblRoom1CheckIn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlRoom1ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRoom1TimerTitle)
                    .addComponent(lblRoom1Timer))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        scrollRoom1.setViewportView(pnlRoom1Content);

        javax.swing.GroupLayout pnlRoom1OuterLayout = new javax.swing.GroupLayout(pnlRoom1Outer);
        pnlRoom1Outer.setLayout(pnlRoom1OuterLayout);
        pnlRoom1OuterLayout.setHorizontalGroup(
            pnlRoom1OuterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRoom1OuterLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblRoom1Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRemoveRoom1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(scrollRoom1, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
        );
        pnlRoom1OuterLayout.setVerticalGroup(
            pnlRoom1OuterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRoom1OuterLayout.createSequentialGroup()
                .addGroup(pnlRoom1OuterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRemoveRoom1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlRoom1OuterLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblRoom1Title)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollRoom1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        // --- ROOM 2 (Initialized with "---") ---
        pnlRoom2Outer.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bahnschrift", 1, 18)));

        lblRoom2Title.setFont(new java.awt.Font("Segoe UI", 1, 20));
        lblRoom2Title.setForeground(new java.awt.Color(204, 153, 0));
        lblRoom2Title.setText("ROOM 2");

        btnRemoveRoom2.setBackground(new java.awt.Color(153, 0, 0));
        btnRemoveRoom2.setFont(new java.awt.Font("Segoe UI", 1, 18));
        btnRemoveRoom2.setForeground(new java.awt.Color(255, 255, 255));
        btnRemoveRoom2.setText("-");

        scrollRoom2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);

        lblRoom2NumberTitle.setFont(new java.awt.Font("Segoe UI", 1, 14));
        lblRoom2NumberTitle.setText("Room #:");

        lblRoom2Number.setText("---");
        lblRoom2NumberTitle.setVisible(false);
        lblRoom2Number.setVisible(false);

        lblRoom2Reservation.setFont(new java.awt.Font("Segoe UI", 1, 14));
        lblRoom2Reservation.setText("Reservation Code:");

        lblRoom2Code.setText("---");

        lblRoom2CheckInTitle.setFont(new java.awt.Font("Segoe UI", 1, 14));
        lblRoom2CheckInTitle.setText("Checked In:");

        lblRoom2CheckIn.setText("---");

        lblRoom2TimerTitle.setFont(new java.awt.Font("Segoe UI", 1, 14));
        lblRoom2TimerTitle.setText("Time Remaining:");

        lblRoom2Timer.setText("---");

        javax.swing.GroupLayout pnlRoom2ContentLayout = new javax.swing.GroupLayout(pnlRoom2Content);
        pnlRoom2Content.setLayout(pnlRoom2ContentLayout);
        pnlRoom2ContentLayout.setHorizontalGroup(
            pnlRoom2ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRoom2ContentLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnlRoom2ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRoom2NumberTitle)
                    .addComponent(lblRoom2Reservation)
                    .addComponent(lblRoom2CheckInTitle)
                    .addComponent(lblRoom2TimerTitle))
                .addGap(86, 86, 86)
                .addGroup(pnlRoom2ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRoom2Timer)
                    .addComponent(lblRoom2CheckIn)
                    .addComponent(lblRoom2Code)
                    .addComponent(lblRoom2Number))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        pnlRoom2ContentLayout.setVerticalGroup(
            pnlRoom2ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRoom2ContentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlRoom2ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRoom2NumberTitle)
                    .addComponent(lblRoom2Number))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlRoom2ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRoom2Reservation)
                    .addComponent(lblRoom2Code))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlRoom2ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRoom2CheckInTitle)
                    .addComponent(lblRoom2CheckIn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlRoom2ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRoom2TimerTitle)
                    .addComponent(lblRoom2Timer))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        scrollRoom2.setViewportView(pnlRoom2Content);

        javax.swing.GroupLayout pnlRoom2OuterLayout = new javax.swing.GroupLayout(pnlRoom2Outer);
        pnlRoom2Outer.setLayout(pnlRoom2OuterLayout);
        pnlRoom2OuterLayout.setHorizontalGroup(
            pnlRoom2OuterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRoom2OuterLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblRoom2Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRemoveRoom2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(scrollRoom2, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
        );
        pnlRoom2OuterLayout.setVerticalGroup(
            pnlRoom2OuterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRoom2OuterLayout.createSequentialGroup()
                .addGroup(pnlRoom2OuterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRemoveRoom2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlRoom2OuterLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblRoom2Title)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollRoom2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        // --- ROOM 3 (Initialized with "---") ---
        pnlRoom3Outer.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bahnschrift", 1, 18)));

        lblRoom3Title.setFont(new java.awt.Font("Segoe UI", 1, 20));
        lblRoom3Title.setForeground(new java.awt.Color(204, 153, 0));
        lblRoom3Title.setText("ROOM 3");

        btnRemoveRoom3.setBackground(new java.awt.Color(153, 0, 0));
        btnRemoveRoom3.setFont(new java.awt.Font("Segoe UI", 1, 18));
        btnRemoveRoom3.setForeground(new java.awt.Color(255, 255, 255));
        btnRemoveRoom3.setText("-");

        scrollRoom3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);

        lblRoom3NumberTitle.setFont(new java.awt.Font("Segoe UI", 1, 14));
        lblRoom3NumberTitle.setText("Room #:");

        lblRoom3Number.setText("---");
        lblRoom3NumberTitle.setVisible(false);
        lblRoom3Number.setVisible(false);

        lblRoom3Reservation.setFont(new java.awt.Font("Segoe UI", 1, 14));
        lblRoom3Reservation.setText("Reservation Code:");

        lblRoom3Code.setText("---");

        lblRoom3CheckInTitle.setFont(new java.awt.Font("Segoe UI", 1, 14));
        lblRoom3CheckInTitle.setText("Checked In:");

        lblRoom3CheckIn.setText("---");

        lblRoom3TimerTitle.setFont(new java.awt.Font("Segoe UI", 1, 14));
        lblRoom3TimerTitle.setText("Time Remaining:");

        lblRoom3Timer.setText("---");

        javax.swing.GroupLayout pnlRoom3ContentLayout = new javax.swing.GroupLayout(pnlRoom3Content);
        pnlRoom3Content.setLayout(pnlRoom3ContentLayout);
        pnlRoom3ContentLayout.setHorizontalGroup(
            pnlRoom3ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRoom3ContentLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnlRoom3ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRoom3NumberTitle)
                    .addComponent(lblRoom3Reservation)
                    .addComponent(lblRoom3CheckInTitle)
                    .addComponent(lblRoom3TimerTitle))
                .addGap(85, 85, 85)
                .addGroup(pnlRoom3ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRoom3Timer)
                    .addComponent(lblRoom3CheckIn)
                    .addComponent(lblRoom3Code)
                    .addComponent(lblRoom3Number))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        pnlRoom3ContentLayout.setVerticalGroup(
            pnlRoom3ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRoom3ContentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlRoom3ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRoom3NumberTitle)
                    .addComponent(lblRoom3Number))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlRoom3ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRoom3Reservation)
                    .addComponent(lblRoom3Code))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlRoom3ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRoom3CheckInTitle)
                    .addComponent(lblRoom3CheckIn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlRoom3ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRoom3TimerTitle)
                    .addComponent(lblRoom3Timer))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        scrollRoom3.setViewportView(pnlRoom3Content);

        javax.swing.GroupLayout pnlRoom3OuterLayout = new javax.swing.GroupLayout(pnlRoom3Outer);
        pnlRoom3Outer.setLayout(pnlRoom3OuterLayout);
        pnlRoom3OuterLayout.setHorizontalGroup(
            pnlRoom3OuterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRoom3OuterLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblRoom3Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRemoveRoom3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(scrollRoom3, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
        );
        pnlRoom3OuterLayout.setVerticalGroup(
            pnlRoom3OuterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRoom3OuterLayout.createSequentialGroup()
                .addGroup(pnlRoom3OuterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRemoveRoom3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlRoom3OuterLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblRoom3Title)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollRoom3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlRoom4Outer.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18)));
        lblRoom4Title.setFont(new java.awt.Font("Segoe UI", 1, 20));
        lblRoom4Title.setForeground(new java.awt.Color(204, 153, 0));
        lblRoom4Title.setText("RESEARCH ROOM");
        btnRemoveRoom4.setBackground(new java.awt.Color(153, 0, 0));
        btnRemoveRoom4.setFont(new java.awt.Font("Segoe UI", 1, 18));
        btnRemoveRoom4.setForeground(new java.awt.Color(255, 255, 255));
        btnRemoveRoom4.setText("-");
        scrollRoom4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        lblRoom4Reservation.setFont(new java.awt.Font("Segoe UI", 1, 14));
        lblRoom4Reservation.setText("Reservation Code:");
        lblRoom4CheckInTitle.setFont(new java.awt.Font("Segoe UI", 1, 14));
        lblRoom4CheckInTitle.setText("Checked In:");
        lblRoom4TimerTitle.setFont(new java.awt.Font("Segoe UI", 1, 14));
        lblRoom4TimerTitle.setText("Time Remaining:");
        lblRoom4Code.setText("---");
        lblRoom4CheckIn.setText("---");
        lblRoom4Timer.setText("---");

        javax.swing.GroupLayout pnlRoom4ContentLayout = new javax.swing.GroupLayout(pnlRoom4Content);
        pnlRoom4Content.setLayout(pnlRoom4ContentLayout);
        pnlRoom4ContentLayout.setHorizontalGroup(
            pnlRoom4ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRoom4ContentLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pnlRoom4ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRoom4Reservation)
                    .addComponent(lblRoom4CheckInTitle)
                    .addComponent(lblRoom4TimerTitle))
                .addGap(85, 85, 85)
                .addGroup(pnlRoom4ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRoom4Code)
                    .addComponent(lblRoom4CheckIn)
                    .addComponent(lblRoom4Timer))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        pnlRoom4ContentLayout.setVerticalGroup(
            pnlRoom4ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRoom4ContentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlRoom4ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRoom4Reservation)
                    .addComponent(lblRoom4Code))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlRoom4ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRoom4CheckInTitle)
                    .addComponent(lblRoom4CheckIn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlRoom4ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRoom4TimerTitle)
                    .addComponent(lblRoom4Timer))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        scrollRoom4.setViewportView(pnlRoom4Content);

        javax.swing.GroupLayout pnlRoom4OuterLayout = new javax.swing.GroupLayout(pnlRoom4Outer);
        pnlRoom4Outer.setLayout(pnlRoom4OuterLayout);
        pnlRoom4OuterLayout.setHorizontalGroup(
            pnlRoom4OuterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRoom4OuterLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblRoom4Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRemoveRoom4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(scrollRoom4, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
        );
        pnlRoom4OuterLayout.setVerticalGroup(
            pnlRoom4OuterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRoom4OuterLayout.createSequentialGroup()
                .addGroup(pnlRoom4OuterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRemoveRoom4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlRoom4OuterLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblRoom4Title)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollRoom4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlRoom5Outer.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18)));
        lblRoom5Title.setFont(new java.awt.Font("Segoe UI", 1, 20));
        lblRoom5Title.setForeground(new java.awt.Color(204, 153, 0));
        lblRoom5Title.setText("MULTIMEDIA ROOM");
        scrollRoom5.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        lblRoom5Reservation.setFont(new java.awt.Font("Segoe UI", 1, 14));
        lblRoom5Reservation.setText("Reservation Code:");
        lblRoom5CheckInTitle.setFont(new java.awt.Font("Segoe UI", 1, 14));
        lblRoom5CheckInTitle.setText("Checked In:");
        lblRoom5TimerTitle.setFont(new java.awt.Font("Segoe UI", 1, 14));
        lblRoom5TimerTitle.setText("Time Remaining:");
        lblRoom5Code.setText("---");
        lblRoom5CheckIn.setText("---");
        lblRoom5Timer.setText("---");

        javax.swing.GroupLayout pnlRoom5ContentLayout = new javax.swing.GroupLayout(pnlRoom5Content);
        pnlRoom5Content.setLayout(pnlRoom5ContentLayout);
        pnlRoom5ContentLayout.setHorizontalGroup(
            pnlRoom5ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRoom5ContentLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pnlRoom5ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRoom5Reservation)
                    .addComponent(lblRoom5CheckInTitle)
                    .addComponent(lblRoom5TimerTitle))
                .addGap(85, 85, 85)
                .addGroup(pnlRoom5ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRoom5Code)
                    .addComponent(lblRoom5CheckIn)
                    .addComponent(lblRoom5Timer))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        pnlRoom5ContentLayout.setVerticalGroup(
            pnlRoom5ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRoom5ContentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlRoom5ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRoom5Reservation)
                    .addComponent(lblRoom5Code))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlRoom5ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRoom5CheckInTitle)
                    .addComponent(lblRoom5CheckIn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlRoom5ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRoom5TimerTitle)
                    .addComponent(lblRoom5Timer))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        scrollRoom5.setViewportView(pnlRoom5Content);

        javax.swing.GroupLayout pnlRoom5OuterLayout = new javax.swing.GroupLayout(pnlRoom5Outer);
        pnlRoom5Outer.setLayout(pnlRoom5OuterLayout);
        pnlRoom5OuterLayout.setHorizontalGroup(
            pnlRoom5OuterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRoom5OuterLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblRoom5Title)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(scrollRoom5, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
        );
        pnlRoom5OuterLayout.setVerticalGroup(
            pnlRoom5OuterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRoom5OuterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRoom5Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollRoom5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnRemoveRoom1.setVisible(false);
        btnRemoveRoom2.setVisible(false);
        btnRemoveRoom3.setVisible(false);
        btnRemoveRoom4.setVisible(false);

        javax.swing.GroupLayout pnlRoomsContainerLayout = new javax.swing.GroupLayout(pnlRoomsContainer);
        pnlRoomsContainer.setLayout(pnlRoomsContainerLayout);
        pnlRoomsContainerLayout.setHorizontalGroup(
            pnlRoomsContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRoomsContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlRoomsContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlRoom1Outer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlRoom2Outer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlRoom3Outer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlRoom4Outer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlRoom5Outer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlRoomsContainerLayout.setVerticalGroup(
            pnlRoomsContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRoomsContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlRoom1Outer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlRoom2Outer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlRoom3Outer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlRoom4Outer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlRoom5Outer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

            scrollRooms = new javax.swing.JScrollPane(pnlRoomsContainer);
            scrollRooms.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
            scrollRooms.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
            scrollRooms.setPreferredSize(new java.awt.Dimension(400, 600));

        // --- MAIN FRAME LAYOUT ---
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlLeftColumn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollRooms, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlLeftColumn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollRooms, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }

    // --- Public Getters for Backend Data Control ---
    public JLabel getLblOutputReservationCode() { return lblOutputReservationCode; }
    public JLabel getLblOutputStudentName() { return lblOutputStudentName; }
    public JLabel getLblOutputDate() { return lblOutputDate; }
    public JLabel getLblOutputTime() { return lblOutputTime; }
    public JLabel getLblOutputDuration() { return lblOutputDuration; }
    public JLabel getLblOutputStatus() { return lblOutputStatus; }
    
    // Room Getters
    public JLabel getLblRoom1Title() { return lblRoom1Title; }
    public JLabel getLblRoom1Number() { return lblRoom1Number; }
    public JLabel getLblRoom1Code() { return lblRoom1Code; }
    public JLabel getLblRoom1CheckIn() { return lblRoom1CheckIn; }
    public JLabel getLblRoom1Timer() { return lblRoom1Timer; }
    public JPanel getPnlRoom1Content() { return pnlRoom1Content; }

    public JLabel getLblRoom2Title() { return lblRoom2Title; }
    public JLabel getLblRoom2Number() { return lblRoom2Number; }
    public JLabel getLblRoom2Code() { return lblRoom2Code; }
    public JLabel getLblRoom2CheckIn() { return lblRoom2CheckIn; }
    public JLabel getLblRoom2Timer() { return lblRoom2Timer; }
    public JPanel getPnlRoom2Content() { return pnlRoom2Content; }

    public JLabel getLblRoom3Title() { return lblRoom3Title; }
    public JLabel getLblRoom3Number() { return lblRoom3Number; }
    public JLabel getLblRoom3Code() { return lblRoom3Code; }
    public JLabel getLblRoom3CheckIn() { return lblRoom3CheckIn; }
    public JLabel getLblRoom3Timer() { return lblRoom3Timer; }
    public JPanel getPnlRoom3Content() { return pnlRoom3Content; }

    public JLabel getLblRoom4Title() { return lblRoom4Title; }
    public JLabel getLblRoom4Code() { return lblRoom4Code; }
    public JLabel getLblRoom4CheckIn() { return lblRoom4CheckIn; }
    public JLabel getLblRoom4Timer() { return lblRoom4Timer; }

    public JLabel getLblRoom5Title() { return lblRoom5Title; }
    public JLabel getLblRoom5Code() { return lblRoom5Code; }
    public JLabel getLblRoom5CheckIn() { return lblRoom5CheckIn; }
    public JLabel getLblRoom5Timer() { return lblRoom5Timer; }

    public JButton getBtnReserve() { return btnReserve; }
    public JButton getBtnDone() { return btnDone; }
    public java.awt.TextField getTxtStudentName() { return txtStudentName; }
    public java.awt.TextField getTxtStudentID() { return txtStudentID; }
    public java.awt.TextField getTxtDate() { return txtDate; }
    public JComboBox<String> getCmbStartTime() { return cmbStartTime; }
    public JComboBox<String> getCmbDuration() { return cmbDuration; }

    private void initControllerActions() {
        // 1. RESERVE BUTTON ACTION
        btnReserve.addActionListener(e -> {
            try {
                String name = txtStudentName.getText().trim();
                String id = txtStudentID.getText().trim();
                String date = txtDate.getText().trim();
                
                int startTimeInt = parseStartTime(cmbStartTime.getSelectedItem().toString());
                int durationInt = parseDuration(cmbDuration.getSelectedItem().toString());
                int headcount = Integer.parseInt(txtHeadcount.getText().trim());

                // Call backend manager
                libraryManager.createReservation(name, id, date, startTimeInt, durationInt, headcount);
                Reservation staged = libraryManager.getStagedReservation();

                if (staged != null) {
                    showReservationDetails(staged);
                    
                    JOptionPane.showMessageDialog(this, "Reservation staged successfully! Code: " + staged.getReservationCode());
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error creating reservation: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        // 2. DONE BUTTON ACTION (Confirms staged reservation into Room 1 as an example)
        btnDone.addActionListener(e -> {
            int targetRoomNum = cmbRoomSelection.getSelectedIndex() + 1;
            boolean success = libraryManager.confirmReservationToRoom(targetRoomNum);

            if (success) {
                Room r = libraryManager.getRoom(targetRoomNum);
                Reservation activeRes = r.getActiveReservation();

                updateRoomDisplay(r, activeRes);
                clearReservationDetails();

                Reservation addedReservation = r.getReservationQueue().getLast();
                String action = "ACTIVE".equals(addedReservation.getStatus())
                    ? "checked into" : "added to the queue for";
                JOptionPane.showMessageDialog(this, "Reservation successfully " + action
                    + " Room " + targetRoomNum + "!");
            } else {
                JOptionPane.showMessageDialog(this, "Failed to confirm reservation. Room might be over capacity or no reservation is staged.", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        });
    }

    private void showReservationDetails(Reservation reservation) {
        lblOutputReservationCode.setText(reservation.getReservationCode());
        lblOutputStudentName.setText(reservation.getStudent().getName());
        lblOutputDate.setText(reservation.getDate());
        lblOutputTime.setText(formatTime(reservation.getTime()));
        lblOutputDuration.setText(reservation.getDuration() + " Hour(s)");
        lblOutputHeadcount.setText(String.valueOf(reservation.getNumberOfStudents()));
        lblOutputStatus.setText(reservation.getStatus().toUpperCase());
    }

    private void addQueueClickHandler(JLabel queueLabel, int roomNumber) {
        queueLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        queueLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent event) {
                Room room = libraryManager.getRoom(roomNumber);
                if (room == null || room.getReservationQueue().isEmpty()) {
                    return;
                }

                int lineHeight = queueLabel.getFontMetrics(queueLabel.getFont()).getHeight();
                int selectedIndex = Math.max(0, event.getY() / lineHeight);
                if (selectedIndex < room.getReservationQueue().size()) {
                    showReservationDetails(room.getReservationQueue().get(selectedIndex));
                }
            }
        });
    }

    private String formatTime(int hour) {
        if (hour == 12) {
            return "12:00 PM";
        }
        if (hour > 12) {
            return (hour - 12) + ":00 PM";
        }
        return hour + ":00 AM";
    }

    private void clearReservationDetails() {
        for (JLabel label : new JLabel[] { lblOutputReservationCode, lblOutputStudentName,
                lblOutputDate, lblOutputTime, lblOutputDuration, lblOutputStatus }) {
            label.setText("---");
        }
        lblOutputHeadcount.setText("---");
    }

    private void updateRoomDisplay(Room room, Reservation reservation) {
        JLabel codeLabel = null;
        JLabel checkInLabel = null;
        switch (room.getRoomNumber()) {
            case 1:
                codeLabel = lblRoom1Code;
                checkInLabel = lblRoom1CheckIn;
                break;
            case 2:
                codeLabel = lblRoom2Code;
                checkInLabel = lblRoom2CheckIn;
                break;
            case 3:
                codeLabel = lblRoom3Code;
                checkInLabel = lblRoom3CheckIn;
                break;
            case 4:
                lblRoom4Code.setText(formatQueue(room));
                lblRoom4CheckIn.setText(formatQueueStatus(room));
                break;
            case 5:
                lblRoom5Code.setText(formatQueue(room));
                lblRoom5CheckIn.setText(formatQueueStatus(room));
                break;
            default:
                return;
        }

        if (codeLabel != null) {
            codeLabel.setText(formatQueue(room));
            checkInLabel.setText(formatQueueStatus(room));
        }

        Reservation activeReservation = room.getActiveReservation();
        if (activeReservation == null) {
            roomEndTimes.remove(room.getRoomNumber());
            setRoomTimer(room.getRoomNumber(), "---");
        } else if (!roomEndTimes.containsKey(room.getRoomNumber())) {
            roomEndTimes.put(room.getRoomNumber(), System.currentTimeMillis()
                    + activeReservation.getDuration() * 3600000L);
            updateRoomTimer(room.getRoomNumber());
        }
    }

    private String formatQueue(Room room) {
        StringBuilder summary = new StringBuilder("<html>");
        for (Reservation queuedReservation : room.getReservationQueue()) {
            summary.append(queuedReservation.getReservationCode())
                    .append(" (")
                    .append(queuedReservation.getNumberOfStudents())
                    .append(" student(s), ")
                    .append(queuedReservation.getStatus())
                    .append(")<br>");
        }
        return summary.append("</html>").toString();
    }

    private String formatQueueStatus(Room room) {
        Reservation activeReservation = room.getActiveReservation();
        if (activeReservation == null) {
            return "---";
        }
        return activeReservation.getReservationCode() + " ("
                + activeReservation.getNumberOfStudents() + " student(s))";
    }

    private void updateRoomTimers() {
        long now = System.currentTimeMillis();
        for (int roomNumber = 1; roomNumber <= 5; roomNumber++) {
            Room room = libraryManager.getRoom(roomNumber);
            Long endTime = roomEndTimes.get(roomNumber);
            if (endTime != null && endTime <= now) {
                roomEndTimes.remove(roomNumber);
                Reservation nextReservation = libraryManager.advanceRoomQueue(roomNumber);
                updateRoomDisplay(room, nextReservation);
            } else if (endTime != null) {
                updateRoomTimer(roomNumber);
            } else if (room.getActiveReservation() == null) {
                Reservation nextReservation = libraryManager.advanceRoomQueue(roomNumber);
                if (nextReservation != null) {
                    updateRoomDisplay(room, nextReservation);
                }
            }
        }
    }

    private void setRoomTimer(int roomNumber, String text) {
        switch (roomNumber) {
            case 1:
                lblRoom1Timer.setText(text);
                break;
            case 2:
                lblRoom2Timer.setText(text);
                break;
            case 3:
                lblRoom3Timer.setText(text);
                break;
            case 4:
                lblRoom4Timer.setText(text);
                break;
            case 5:
                lblRoom5Timer.setText(text);
                break;
            default:
                break;
        }
    }

    private void updateRoomTimer(int roomNumber) {
        Long endTime = roomEndTimes.get(roomNumber);
        if (endTime == null) {
            return;
        }

        long remaining = Math.max(0, endTime - System.currentTimeMillis());
        long totalSeconds = remaining / 1000;
        String text = String.format("%02d:%02d:%02d", totalSeconds / 3600,
                (totalSeconds % 3600) / 60, totalSeconds % 60);
        setRoomTimer(roomNumber, text);
    }

    private int parseStartTime(String time) {
        String hour = time.substring(0, time.indexOf(':'));
        int parsedHour = Integer.parseInt(hour);
        return parsedHour < 7 ? parsedHour + 12 : parsedHour;
    }

    private int parseDuration(String duration) {
        return Integer.parseInt(duration.substring(0, duration.indexOf(' ')));
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> new RoomReservationGUI().setVisible(true));
    }
}