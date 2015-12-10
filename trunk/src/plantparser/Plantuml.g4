grammar Plantuml;

file : ( comment | statement | otherLine )+;

statement : startUml |
             sprite |
             startBox |
             participant |
             startGroup |
             end |
             message |
             note |
             endNote |             
             endUml ;


NEWLINE : '\r'?'\n';
SPACE : [ \t];


SINGLE_LINE_COMMENT : '\'' .*? NEWLINE;
singleLineComment : SINGLE_LINE_COMMENT ;

START_MULITLINE_COMMENT : '/\'' .*? NEWLINE ;
startMultilineComment : START_MULITLINE_COMMENT ;

END_MULTILINE_COMMENT : .*? '\'/' .*? NEWLINE;
endMultiLineComment : END_MULTILINE_COMMENT ;

comment : singleLineComment | startMultilineComment | endMultiLineComment ;


START_UML : '@startuml' SPACE*? NEWLINE;
startUml : START_UML;


NOT_WHITE_SPACE : ~[ \t\r\n];
PARTICIPANT_ID : NOT_WHITE_SPACE+? ;
PARTS :       'participant' |
              'actor' |
              'entity' |
              'boundary' |
              'database' ;

SPRITE : 'sprite' SPACE+? .*? NEWLINE;
sprite : SPRITE ;

QUOTED_STRING : '"' .+? '"' ;
PARTICIPANT : PARTS SPACE+? PARTICIPANT_ID SPACE*? NEWLINE;
PARTICIPANT_AS : PARTS SPACE+? QUOTED_STRING SPACE+? 'as' SPACE+? PARTICIPANT_ID SPACE*? NEWLINE;
participant : PARTICIPANT | PARTICIPANT_AS;


START_BOX : 'box' SPACE? (QUOTED_STRING | .+?) NEWLINE;
startBox : START_BOX;

GROUPS : 'alt'      |
         'else'     |
         'opt'      |
         'loop'     |
         'par'      |
         'break'    |
         'critical' |
         'group' ;

START_GROUP : GROUPS SPACE+? (QUOTED_STRING | .+?) NEWLINE; 
startGroup : START_GROUP ;

MESSAGE_STRING : QUOTED_STRING | .+?;
MESSAGE : PARTICIPANT_ID SPACE+? '-' '[#'? .*? ']'? '>' SPACE*? PARTICIPANT_ID SPACE*? ':' SPACE*? MESSAGE_STRING NEWLINE;
message : MESSAGE ;

END : 'end' SPACE*? NEWLINE;
end : END;

NOTE_POSITION : 'right' | 'left' | 'over';
NOTE_STRING : (QUOTED_STRING | .+?);
SINGLE_NOTE : 'note' SPACE+? NOTE_POSITION SPACE*? 'of'? SPACE*? PARTICIPANT_ID? SPACE*? ','? SPACE+? PARTICIPANT? SPACE*? ':' SPACE*? NOTE_STRING NEWLINE;
MULTI_NOTE : 'note' SPACE*? NOTE_POSITION SPACE*? 'of'? SPACE*? PARTICIPANT_ID? SPACE*? ','? SPACE*? PARTICIPANT? SPACE*? NEWLINE;
singleLineNote : SINGLE_NOTE;
multiLineNote : MULTI_NOTE;
note : singleLineNote | multiLineNote ;

END_NOTE : 'end' SPACE+? 'note' SPACE*? NEWLINE;
endNote : END_NOTE;

END_UML : '@enduml' SPACE*? NEWLINE?;
endUml : END_UML;

OTHER_LINE : .*? NEWLINE;
otherLine : OTHER_LINE | NEWLINE;

