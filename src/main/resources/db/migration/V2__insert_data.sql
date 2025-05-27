
LOAD DATA LOCAL INFILE '${dataPath}'
    INTO TABLE 書誌
    CHARACTER SET utf8mb4
    FIELDS TERMINATED BY '\t'
    LINES TERMINATED BY '\n'
    IGNORE 1 LINES
    (
     書誌ID,
     タイトル,
     タイトルよみ,
     シリーズタイトル,
     責任表示,
     出版者,
     出版地,
     出版年月日等,
     出版年,
     分類_NDC,
     分類_NDLC,
     件名標目,
     ジャンル_形式用語,
     請求記号,
     ISBN
        );