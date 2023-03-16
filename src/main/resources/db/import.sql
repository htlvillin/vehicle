setval('hibernate_sequence', 1ßß1)
INSERT INTO x_person( p_id, p_dob, p_name) VALUES (1, '2000-01-02', 'John Doe')

INSERT INTO x_vehicle( v_id, v_model, v_brand ) VALUES ( 1,'Golf V', 'VW' );
INSERT INTO x_vehicle( v_id, v_model, v_brand ) VALUES ( 2,'Tucson', 'Hyundai' );

INSERT INTO x_rental( r_id, r_discount, r_end_date_time, r_start_date_time_ r_p_id, r_v_id)
VALUES ( 1, 0, '2023-03-17 17:16:00', '23-03-16 10:56:00', 1, 1);
    INSERT INTO x_rental( r_id, r_discount, r_end_date_time, r_start_date_time_ r_p_id, r_v_id)
VALUES ( 1, 0, '2023-03-13 17:16:00', '23-03-12 10:56:00', 1, 2);
