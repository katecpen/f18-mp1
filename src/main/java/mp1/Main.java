package mp1;

import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String url1 = "http://www.gutenberg.org/files/244/244-0.txt";
        String[][] urls = {
                {"Marlowe: Tamburlaine The Great - Part 1",
                        "http://www.gutenberg.org/cache/epub/1094/pg1094.txt"},
                {"Marlowe: The Tragical History of Doctor Faustus", "http://www.gutenberg.org/cache/epub/779/pg779.txt"},
                {"Twain: The Adventures of Huckleberry Finn - Part 1", "http://www.gutenberg.org/cache/epub/7100/pg7100.txt"},
                {"Twain: The Adventures of Tom Sawyer - Part 1", "http://www.gutenberg.org/cache/epub/7193/pg7193.txt"},
                {"Emily Bronte: Wuthering Heights", "http://www.gutenberg.org/cache/epub/768/pg768.txt"},
                {"Anne Bronte: The Tenant of Wildfell Hall", "http://www.gutenberg.org/files/969/969-0.txt"},
                {"Jane Austen: Northanger Abbey", "http://www.gutenberg.org/files/121/121-0.txt"},
                {"Jane Austen: Pride and Prejudice", "http://www.gutenberg.org/files/1342/1342-0.txt"},
                {"Jane Austen: Sense and Sensibility", "http://www.gutenberg.org/cache/epub/21839/pg21839.txt"},
                {"Jane Austen: Persuasion", "http://www.gutenberg.org/cache/epub/105/pg105.txt"},
                {"Arthur Conan Doyle: A Study in Scarlet", "http://www.gutenberg.org/files/244/244-0.txt"},
                {"Shakespeare: The Tempest", "http://www.gutenberg.org/files/23042/23042-0.txt"},
                {"Shakespeare: Othello", "http://www.gutenberg.org/cache/epub/2267/pg2267.txt"},
                {"Arthur Conan Doyle: The Hound of Baskervilles", "http://www.gutenberg.org/files/2852/2852-0.txt"},
                {"Shakespeare: Macbeth", "http://www.gutenberg.org/cache/epub/2264/pg2264.txt"},
                {"Shakespeare: Hamlet", "http://www.gutenberg.org/files/1524/1524-0.txt"},
                {"Murrelle: Sly Fox", "http://textfiles.com/stories/13chil.txt"},
//                "http://textfiles.com/stories/14.lws",
//                "http://textfiles.com/stories/16.lws",
//                "http://textfiles.com/stories/17.lws",
//                "http://textfiles.com/stories/18.lws",
//                "http://textfiles.com/stories/19.lws",
//                "http://textfiles.com/stories/20.lws",
//                "http://textfiles.com/stories/3gables.txt",
//                "http://textfiles.com/stories/3lpigs.txt",
//                "http://textfiles.com/stories/3sonnets.vrs",
//                "http://textfiles.com/stories/3student.txt",
//                "http://textfiles.com/stories/3wishes.txt",
//                "http://textfiles.com/stories/4moons.txt",
//                "http://textfiles.com/stories/5orange.txt",
//                "http://textfiles.com/stories/6ablemen.txt",
//                "http://textfiles.com/stories/6napolen.txt",
//                "http://textfiles.com/stories/7oldsamr.txt",
//                "http://textfiles.com/stories/7voysinb.txt",
//                "http://textfiles.com/stories/ab40thv.txt",
//                "http://textfiles.com/stories/abbey.txt",
//                "http://textfiles.com/stories/abyss.txt",
//                "http://textfiles.com/stories/adler.txt",
//                "http://textfiles.com/stories/adv_alad.txt",
//                "http://textfiles.com/stories/advsayed.txt",
//                "http://textfiles.com/stories/advtthum.txt",
//                "http://textfiles.com/stories/aesop11.txt",
//                "http://textfiles.com/stories/aesopa10.txt",
//                "http://textfiles.com/stories/aircon.txt",
//                "http://textfiles.com/stories/aisle.six",
//                "http://textfiles.com/stories/aislesix.txt",
//                "http://textfiles.com/stories/alad10.txt",
//                "http://textfiles.com/stories/alissadl.txt",
//                "http://textfiles.com/stories/altside.hum",
//                "http://textfiles.com/stories/aluminum.hum",
//                "http://textfiles.com/stories/aminegg.txt",
//                "http://textfiles.com/stories/angelfur.hum",
//                "http://textfiles.com/stories/angry_ca.txt",
//                "http://textfiles.com/stories/antcrick.txt",
//                "http://textfiles.com/stories/aquith.txt",
//                "http://textfiles.com/stories/arcadia.sty",
//                "http://textfiles.com/stories/archive",
//                "http://textfiles.com/stories/arctic.txt",
//                "http://textfiles.com/stories/asop",
//                "http://textfiles.com/stories/assorted.txt",
//                "http://textfiles.com/stories/bagel.man",
//                "http://textfiles.com/stories/bagelman.txt",
//                "http://textfiles.com/stories/batlslau.txt",
//                "http://textfiles.com/stories/beast.asc",
//                "http://textfiles.com/stories/beautbst.txt",
//                "http://textfiles.com/stories/beggars.txt",
//                "http://textfiles.com/stories/bern",
//                "http://textfiles.com/stories/berternie.txt",
//                "http://textfiles.com/stories/bestwish",
//                "http://textfiles.com/stories/beyond.hum",
//                "http://textfiles.com/stories/bgb.txt",
//                "http://textfiles.com/stories/bgcspoof.txt",
//                "http://textfiles.com/stories/bigred.hum",
//                "http://textfiles.com/stories/bishop00.txt",
//                "http://textfiles.com/stories/blabnove.hum",
//                "http://textfiles.com/stories/blabnove.txt",
//                "http://textfiles.com/stories/blackp.txt",
//                "http://textfiles.com/stories/blackrdr",
//                "http://textfiles.com/stories/blak",
//                "http://textfiles.com/stories/blasters.fic",
//                "http://textfiles.com/stories/blh.txt",
//                "http://textfiles.com/stories/blind.txt",
//                "http://textfiles.com/stories/blossom.pom",
//                "http://textfiles.com/stories/blue",
//                "http://textfiles.com/stories/bluebrd.txt",
//                "http://textfiles.com/stories/bookem.1",
//                "http://textfiles.com/stories/bookem2",
//                "http://textfiles.com/stories/bookem3",
//                "http://textfiles.com/stories/brain.damage",
//                "http://textfiles.com/stories/bram",
//                "http://textfiles.com/stories/bran",
//                "http://textfiles.com/stories/breaks1.asc",
//                "http://textfiles.com/stories/breaks2.asc",
//                "http://textfiles.com/stories/breaks3.asc",
//                "http://textfiles.com/stories/bruce-p.txt",
//                "http://textfiles.com/stories/buggy.txt",
//                "http://textfiles.com/stories/buldetal.txt",
//                "http://textfiles.com/stories/buldream.txt",
//                "http://textfiles.com/stories/bulfelis.txt",
//                "http://textfiles.com/stories/bulhuntr.txt",
//                "http://textfiles.com/stories/bulironb.txt",
//                "http://textfiles.com/stories/bullove.txt",
//                "http://textfiles.com/stories/bulmrx.txt",
//                "http://textfiles.com/stories/bulnland.txt",
//                "http://textfiles.com/stories/bulnoopt.txt",
//                "http://textfiles.com/stories/bulolli1.txt",
//                "http://textfiles.com/stories/bulolli2.txt",
//                "http://textfiles.com/stories/bulphrek.txt",
//                "http://textfiles.com/stories/bulprint.txt",
//                "http://textfiles.com/stories/bulwer.lytton",
//                "http://textfiles.com/stories/bulzork1.txt",
//                "http://textfiles.com/stories/bumm",
//                "http://textfiles.com/stories/bureau.txt",
//                "http://textfiles.com/stories/burintrv.66",
//                "http://textfiles.com/stories/burintrv.78",
//                "http://textfiles.com/stories/burintrv.92",
//                "http://textfiles.com/stories/burltrs",
//                "http://textfiles.com/stories/burn",
//                "http://textfiles.com/stories/cabin.txt",
//                "http://textfiles.com/stories/cameloto.hum",
//                "http://textfiles.com/stories/campfire.txt",
//                "http://textfiles.com/stories/candle.hum",
//                "http://textfiles.com/stories/cardcnt.txt",
//                "http://textfiles.com/stories/ccm.txt",
//                "http://textfiles.com/stories/charlie.txt",
//                "http://textfiles.com/stories/chik",
//                "http://textfiles.com/stories/clevdonk.txt",
//                "http://textfiles.com/stories/clon",
//                "http://textfiles.com/stories/cmoutmou.txt",
//                "http://textfiles.com/stories/comp",
//                "http://textfiles.com/stories/confilct.fun",
//                "http://textfiles.com/stories/consumdr.hum",
//                "http://textfiles.com/stories/contrad1.hum",
//                "http://textfiles.com/stories/cooldark.sto",
//                "http://textfiles.com/stories/cooldark.txt",
//                "http://textfiles.com/stories/corcor.hum",
//                "http://textfiles.com/stories/cow.exploder",
//                "http://textfiles.com/stories/crabhern.txt",
//                "http://textfiles.com/stories/crazy.hum",
//                "http://textfiles.com/stories/cum",
//                "http://textfiles.com/stories/curious.george",
//                "http://textfiles.com/stories/cybersla.txt",
//                "http://textfiles.com/stories/dakota.txt",
//                "http://textfiles.com/stories/dan",
//                "http://textfiles.com/stories/darkness.txt",
//                "http://textfiles.com/stories/day.in.mcdonald",
//                "http://textfiles.com/stories/deal",
//                "http://textfiles.com/stories/deathmrs.d",
//                "http://textfiles.com/stories/deer.txt",
//                "http://textfiles.com/stories/descent.poe",
//                "http://textfiles.com/stories/diaryflf.txt",
//                "http://textfiles.com/stories/dicegame.txt",
//                "http://textfiles.com/stories/dicksong.txt",
//                "http://textfiles.com/stories/disco.be.fun",
//                "http://textfiles.com/stories/discocanbefun.txt",
//                "http://textfiles.com/stories/domain.poe",
//                "http://textfiles.com/stories/dopedenn.txt",
//                "http://textfiles.com/stories/dskool.txt",
//                "http://textfiles.com/stories/dtruck.txt",
//                "http://textfiles.com/stories/dwar",
//                "http://textfiles.com/stories/elite.app",
//                "http://textfiles.com/stories/elveshoe.txt",
//                "http://textfiles.com/stories/emperor3.txt",
//                "http://textfiles.com/stories/empnclot.txt",
//                "http://textfiles.com/stories/empsjowk.txt",
//                "http://textfiles.com/stories/empty.txt",
//                "http://textfiles.com/stories/enc",
//                "http://textfiles.com/stories/encamp01.txt",
//                "http://textfiles.com/stories/enchdup.hum",
//                "http://textfiles.com/stories/enginer.txt",
//                "http://textfiles.com/stories/enya_trn.txt",
//                "http://textfiles.com/stories/excerpt.hum",
//                "http://textfiles.com/stories/excerpt.txt",
//                "http://textfiles.com/stories/eyeargon.hum",
//                "http://textfiles.com/stories/ezoff",
//                "http://textfiles.com/stories/fable.txt",
//                "http://textfiles.com/stories/fantas.hum",
//                "http://textfiles.com/stories/fantasy.hum",
//                "http://textfiles.com/stories/fantasy.txt",
//                "http://textfiles.com/stories/fea1",
//                "http://textfiles.com/stories/fea2",
//                "http://textfiles.com/stories/fea3",
//                "http://textfiles.com/stories/fear.hum",
//                "http://textfiles.com/stories/fearmnky",
//                "http://textfiles.com/stories/fgoose.txt",
//                "http://textfiles.com/stories/fic1",
//                "http://textfiles.com/stories/fic2",
//                "http://textfiles.com/stories/fic3",
//                "http://textfiles.com/stories/fic4",
//                "http://textfiles.com/stories/fic5",
//                "http://textfiles.com/stories/fic7",
//                "http://textfiles.com/stories/fish.txt",
//                "http://textfiles.com/stories/fleas.txt",
//                "http://textfiles.com/stories/flktrp.txt",
//                "http://textfiles.com/stories/floc",
//                "http://textfiles.com/stories/floobs.txt",
//                "http://textfiles.com/stories/flute.txt",
//                "http://textfiles.com/stories/flytrunk.txt",
//                "http://textfiles.com/stories/forgotte",
//                "http://textfiles.com/stories/fourth.fic",
//                "http://textfiles.com/stories/fowl.death",
//                "http://textfiles.com/stories/foxncrow.txt",
//                "http://textfiles.com/stories/foxngrap.txt",
//                "http://textfiles.com/stories/foxnstrk.txt",
//                "http://textfiles.com/stories/fran",
//                "http://textfiles.com/stories/fred.txt",
//                "http://textfiles.com/stories/freeman.fil",
//                "http://textfiles.com/stories/friend.s",
//                "http://textfiles.com/stories/friends.txt",
//                "http://textfiles.com/stories/frogp.txt",
//                "http://textfiles.com/stories/frum",
//                "http://textfiles.com/stories/game.txt",
//                "http://textfiles.com/stories/gatherng.txt",
//                "http://textfiles.com/stories/gay",
//                "http://textfiles.com/stories/gemdra.txt",
//                "http://textfiles.com/stories/ghost",
//                "http://textfiles.com/stories/girl",
//                "http://textfiles.com/stories/girlclub.txt",
//                "http://textfiles.com/stories/glimpse1.txt",
//                "http://textfiles.com/stories/gloves.txt",
//                "http://textfiles.com/stories/gold3ber.txt",
//                "http://textfiles.com/stories/goldbug.poe",
//                "http://textfiles.com/stories/goldenp.txt",
//                "http://textfiles.com/stories/goldfish.txt",
//                "http://textfiles.com/stories/goldgoos.txt",
//                "http://textfiles.com/stories/grav",
//                "http://textfiles.com/stories/graymare.txt",
//                "http://textfiles.com/stories/greatlrn.leg",
//                "http://textfiles.com/stories/greedog.txt",
//                "http://textfiles.com/stories/gulliver.txt",
//                "http://textfiles.com/stories/hansgrtl.txt",
//                "http://textfiles.com/stories/hareleph.txt",
//                "http://textfiles.com/stories/hareporc.txt",
//                "http://textfiles.com/stories/haretort.txt",
//                "http://textfiles.com/stories/healer.txt",
//                "http://textfiles.com/stories/hell4.txt",
//                "http://textfiles.com/stories/hellmach.txt",
//                "http://textfiles.com/stories/helmfuse.txt",
//                "http://textfiles.com/stories/hils",
//                "http://textfiles.com/stories/history5.txt",
//                "http://textfiles.com/stories/hitch2.txt",
//                "http://textfiles.com/stories/hitch3.txt",
//                "http://textfiles.com/stories/hole2nar.txt",
//                "http://textfiles.com/stories/holmesbk.txt",
//                "http://textfiles.com/stories/home.fil",
//                "http://textfiles.com/stories/hop-frog.poe",
//                "http://textfiles.com/stories/horsdonk.txt",
//                "http://textfiles.com/stories/horswolf.txt",
//                "http://textfiles.com/stories/hotline1.txt",
//                "http://textfiles.com/stories/hotline3.txt",
//                "http://textfiles.com/stories/hotline4.txt",
//                "http://textfiles.com/stories/hound-b.txt",
//                "http://textfiles.com/stories/how.ernie.bert",
//                "http://textfiles.com/stories/idi.hum",
//                "http://textfiles.com/stories/igiv",
//                "http://textfiles.com/stories/imagin.hum",
//                "http://textfiles.com/stories/immortal",
//                "http://textfiles.com/stories/immorti.hum",
//                "http://textfiles.com/stories/imonly17.txt",
//                "http://textfiles.com/stories/inter",
//                "http://textfiles.com/stories/island.poe",
//                "http://textfiles.com/stories/jackbstl.txt",
//                "http://textfiles.com/stories/jackmac.fic",
//                "http://textfiles.com/stories/jaynejob.asc",
//                "http://textfiles.com/stories/jerichms.hum",
//                "http://textfiles.com/stories/jim.asc",
//                "http://textfiles.com/stories/keeping.insanit",
//                "http://textfiles.com/stories/keepmodu.txt",
//                "http://textfiles.com/stories/kharian.txt",
//                "http://textfiles.com/stories/kneeslapper",
//                "http://textfiles.com/stories/kneeslapper.txt",
//                "http://textfiles.com/stories/knuckle.txt",
//                "http://textfiles.com/stories/korea.s",
//                "http://textfiles.com/stories/kzap.txt",
//                "http://textfiles.com/stories/ladylust.hum",
//                "http://textfiles.com/stories/lament.txt",
//                "http://textfiles.com/stories/lgoldbrd.txt",
//                "http://textfiles.com/stories/life.txt",
//                "http://textfiles.com/stories/lil",
//                "http://textfiles.com/stories/lionbird",
//                "http://textfiles.com/stories/lionmane.txt",
//                "http://textfiles.com/stories/lionmosq.txt",
//                "http://textfiles.com/stories/lionwar.txt",
//                "http://textfiles.com/stories/lmermaid.txt",
//                "http://textfiles.com/stories/lmtchgrl.txt",
//                "http://textfiles.com/stories/long1-3.txt",
//                "http://textfiles.com/stories/lpeargrl.txt",
//                "http://textfiles.com/stories/lrrhood.txt",
//                "http://textfiles.com/stories/ltp",
//                "http://textfiles.com/stories/luf",
//                "http://textfiles.com/stories/lure.txt",
//                "http://textfiles.com/stories/mario.txt",
//                "http://textfiles.com/stories/mattress.txt",
//                "http://textfiles.com/stories/mazarin.txt",
//                "http://textfiles.com/stories/mcdonaldl.txt",
//                "http://textfiles.com/stories/melissa.txt",
//                "http://textfiles.com/stories/mike.txt",
//                "http://textfiles.com/stories/mindprob.txt",
//                "http://textfiles.com/stories/mindwar",
//                "http://textfiles.com/stories/missing.txt",
//                "http://textfiles.com/stories/modemhippy.txt",
//                "http://textfiles.com/stories/monkking.txt",
//                "http://textfiles.com/stories/monksol.txt",
//                "http://textfiles.com/stories/mouslion.txt",
//                "http://textfiles.com/stories/mtinder.txt",
//                "http://textfiles.com/stories/musgrave.txt",
//                "http://textfiles.com/stories/musibrem.txt",
//                "http://textfiles.com/stories/mydream.txt",
//                "http://textfiles.com/stories/myeyes",
//                "http://textfiles.com/stories/narciss.txt",
//                "http://textfiles.com/stories/nigel.1",
//                "http://textfiles.com/stories/nigel.10",
//                "http://textfiles.com/stories/nigel.2",
//                "http://textfiles.com/stories/nigel.3",
//                "http://textfiles.com/stories/nigel.4",
//                "http://textfiles.com/stories/nigel.5",
//                "http://textfiles.com/stories/nigel.6",
//                "http://textfiles.com/stories/nigel.7",
//                "http://textfiles.com/stories/nihgel_8.9",
//                "http://textfiles.com/stories/nitepeek.sto",
//                "http://textfiles.com/stories/non2",
//                "http://textfiles.com/stories/non3",
//                "http://textfiles.com/stories/non4",
//                "http://textfiles.com/stories/obstgoat.txt",
//                "http://textfiles.com/stories/omarsheh.txt",
//                "http://textfiles.com/stories/outcast.dos",
//                "http://textfiles.com/stories/oxfrog.txt",
//                "http://textfiles.com/stories/paink-ws.txt",
//                "http://textfiles.com/stories/panama.txt",
//                "http://textfiles.com/stories/parotsha.txt",
//                "http://textfiles.com/stories/partya.txt",
//                "http://textfiles.com/stories/paul_har.sto",
//                "http://textfiles.com/stories/peace.fun",
//                "http://textfiles.com/stories/pepdegener.txt",
//                "http://textfiles.com/stories/pepsi.degenerat",
//                "http://textfiles.com/stories/perf",
//                "http://textfiles.com/stories/pinocch.txt",
//                "http://textfiles.com/stories/piracy.sto",
//                "http://textfiles.com/stories/plescopm.txt",
//                "http://textfiles.com/stories/poem-1.txt",
//                "http://textfiles.com/stories/poem-2.txt",
//                "http://textfiles.com/stories/poem-4.txt",
//                "http://textfiles.com/stories/poplstrm.txt",
//                "http://textfiles.com/stories/pphamlin.txt",
//                "http://textfiles.com/stories/pregn.txt",
//                "http://textfiles.com/stories/prince.art",
//                "http://textfiles.com/stories/progx",
//                "http://textfiles.com/stories/psf.txt",
//                "http://textfiles.com/stories/psi",
//                "http://textfiles.com/stories/psyc",
//                "http://textfiles.com/stories/pussboot.txt",
//                "http://textfiles.com/stories/qcarroll",
//                "http://textfiles.com/stories/quarter.c1",
//                "http://textfiles.com/stories/quarter.c10",
//                "http://textfiles.com/stories/quarter.c11",
//                "http://textfiles.com/stories/quarter.c12",
//                "http://textfiles.com/stories/quarter.c13",
//                "http://textfiles.com/stories/quarter.c14",
//                "http://textfiles.com/stories/quarter.c15",
//                "http://textfiles.com/stories/quarter.c16",
//                "http://textfiles.com/stories/quarter.c17",
//                "http://textfiles.com/stories/quarter.c18",
//                "http://textfiles.com/stories/quarter.c19",
//                "http://textfiles.com/stories/quarter.c2",
//                "http://textfiles.com/stories/quarter.c3",
//                "http://textfiles.com/stories/quarter.c4",
//                "http://textfiles.com/stories/quarter.c5",
//                "http://textfiles.com/stories/quarter.c6",
//                "http://textfiles.com/stories/quarter.c7",
//                "http://textfiles.com/stories/quarter.c8",
//                "http://textfiles.com/stories/quarter.c9",
//                "http://textfiles.com/stories/quest",
//                "http://textfiles.com/stories/quickfix",
//                "http://textfiles.com/stories/quot",
//                "http://textfiles.com/stories/radar_ra.txt",
//                "http://textfiles.com/stories/rainda.txt",
//                "http://textfiles.com/stories/reality.txt",
//                "http://textfiles.com/stories/reap",
//                "http://textfiles.com/stories/redragon.txt",
//                "http://textfiles.com/stories/retrib.txt",
//                "http://textfiles.com/stories/rid.txt",
//                "http://textfiles.com/stories/robotech",
//                "http://textfiles.com/stories/rock",
//                "http://textfiles.com/stories/rocket.sf",
//                "http://textfiles.com/stories/roger1.txt",
//                "http://textfiles.com/stories/running.txt",
//                "http://textfiles.com/stories/s&m_plot",
//                "http://textfiles.com/stories/s&m_that",
//                "http://textfiles.com/stories/safe",
//                "http://textfiles.com/stories/sanpedr2.txt",
//                "http://textfiles.com/stories/shoscomb.txt",
//                "http://textfiles.com/stories/shrdfarm.txt",
//                "http://textfiles.com/stories/shulk.txt",
//                "http://textfiles.com/stories/sick-kid.txt",
//                "http://textfiles.com/stories/sight.txt",
//                "http://textfiles.com/stories/silverb.txt",
//                "http://textfiles.com/stories/sis",
//                "http://textfiles.com/stories/sleprncs.txt",
//                "http://textfiles.com/stories/snow.txt",
//                "http://textfiles.com/stories/snowmaid.txt",
//                "http://textfiles.com/stories/snowqn1.txt",
//                "http://textfiles.com/stories/social.vikings",
//                "http://textfiles.com/stories/socialvikings.txt",
//                "http://textfiles.com/stories/solitary.txt",
//                "http://textfiles.com/stories/space.txt",
//                "http://textfiles.com/stories/spam.key",
//                "http://textfiles.com/stories/spectacl.poe",
//                "http://textfiles.com/stories/spider.txt",
//                "http://textfiles.com/stories/spiders.txt",
//                "http://textfiles.com/stories/sqzply.txt",
//                "http://textfiles.com/stories/sre-dark.txt",
//                "http://textfiles.com/stories/stainles.ana",
//                "http://textfiles.com/stories/stairdre.txt",
//                "http://textfiles.com/stories/startrek.txt",
//                "http://textfiles.com/stories/stsgreek",
//                "http://textfiles.com/stories/sucker.txt",
//                "http://textfiles.com/stories/sunday.txt",
//                "http://textfiles.com/stories/superg1",
//                "http://textfiles.com/stories/szechuan",
//                "http://textfiles.com/stories/t_zone.jok",
//                "http://textfiles.com/stories/tailbear.txt",
//                "http://textfiles.com/stories/tao3.dos",
//                "http://textfiles.com/stories/taxnovel.txt",
//                "http://textfiles.com/stories/tcoa.txt",
//                "http://textfiles.com/stories/tctac.txt",
//                "http://textfiles.com/stories/tearglas.txt",
//                "http://textfiles.com/stories/telefone.txt",
//                "http://textfiles.com/stories/terrorbears.txt",
//                "http://textfiles.com/stories/testpilo.hum",
//                "http://textfiles.com/stories/textfile.primer",
//                "http://textfiles.com/stories/thanksg",
//                "http://textfiles.com/stories/the-tree.txt",
//                "http://textfiles.com/stories/thewave",
//                "http://textfiles.com/stories/timem.hac",
//                "http://textfiles.com/stories/times.fic",
//                "http://textfiles.com/stories/timetrav.txt",
//                "http://textfiles.com/stories/tin",
//                "http://textfiles.com/stories/tinsoldr.txt",
//                "http://textfiles.com/stories/toilet.s",
//                "http://textfiles.com/stories/traitor.txt",
//                "http://textfiles.com/stories/tree.txt",
//                "http://textfiles.com/stories/tuc_mees",
//                "http://textfiles.com/stories/uglyduck.txt",
//                "http://textfiles.com/stories/unluckwr.txt",
//                "http://textfiles.com/stories/vaincrow.txt",
//                "http://textfiles.com/stories/vainsong.txt",
//                "http://textfiles.com/stories/valen",
//                "http://textfiles.com/stories/vampword.txt",
//                "http://textfiles.com/stories/vday.hum",
//                "http://textfiles.com/stories/veiledl.txt",
//                "http://textfiles.com/stories/vgilante.txt",
//                "http://textfiles.com/stories/wall.art",
//                "http://textfiles.com/stories/wanderer.fun",
//                "http://textfiles.com/stories/weaver.txt",
//                "http://textfiles.com/stories/weeprncs.txt",
//                "http://textfiles.com/stories/whgdsreg.reg",
//                "http://textfiles.com/stories/wisteria.txt",
//                "http://textfiles.com/stories/withdraw.cyb",
//                "http://textfiles.com/stories/wlgirl.txt",
//                "http://textfiles.com/stories/wolf7kid.txt",
//                "http://textfiles.com/stories/wolfcran.txt",
//                "http://textfiles.com/stories/wolflamb.txt",
//                "http://textfiles.com/stories/wombat.und",
//                "http://textfiles.com/stories/write",
//                "http://textfiles.com/stories/wrt",
//                "http://textfiles.com/stories/yukon.txt",
                {"McAllister: Zombies", "http://textfiles.com/stories/zombies.txt"}};

        Document d1, d2;
        try {
            d1 = new Document(url1);
        }
        catch (IOException ioe) {
            System.err.println("Could not open the first file!");
            return;
        }

        List<Document> docList = new ArrayList<>();
        for (String[] doc: urls) {
            try {
                docList.add(new Document(doc[0], doc[1]));
                try {
                    Thread.sleep(5000);
                }
                catch (InterruptedException ie) {

                }
            }
            catch (IOException ioe) {
                System.err.println("Could not open " + doc[1]);
            }
        }

        DocumentPair dPair = DocumentSimilarity.closestMatch(docList);
//        System.out.println(dPair.getSimilarity());
//        System.out.println(dPair.getDoc1());
//        System.out.println(dPair.getDoc2());
    }
}
