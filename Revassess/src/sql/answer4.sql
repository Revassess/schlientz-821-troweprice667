SELECT a.username, s.name, c.name, f.question, f.answer 
FROM (app_user a 
    INNER JOIN study_set s 
        ON a.user_id = s.owner_id 
    INNER JOIN study_set_card t
        ON s.study_set_id = t.study_set_id
    INNER JOIN flashcard f
        ON t.flashcard_id = f.flashcard_id
    INNER JOIN category c
        ON f.category_id = c.category_id)
 WHERE s.owner_id = 5;