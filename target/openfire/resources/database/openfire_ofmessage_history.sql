CREATE TABLE ofMessageHistory (
  fromUser              VARCHAR(64)     NOT NULL,
  toUser                VARCHAR(64)     NOT NULL,
  subject               VARCHAR(64)     NOT NULL,
  threadID              INTEGER         NOT NULL,
  creationDate          TIMESTAMP       NOT NULL,
  messageBody           TEXT            NOT NULL,
  PRIMARY KEY (creationDate)
);