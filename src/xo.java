import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.GLU;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class xo extends vl {
	private static final Random a = new Random();

	private float b = 0.0F;
	private String c;
	private abk d;
	private int e = 0;
	private int f;

	public xo() {
		
		// Inventory Tweaks: Fake ModLoader initialization
		ModLoader_InvTweaks.init();
		
		this.c = "missingno";
		try {
			ArrayList localArrayList = new ArrayList();
			BufferedReader localBufferedReader = new BufferedReader(
					new InputStreamReader(xo.class
							.getResourceAsStream("/title/splashes.txt"),
							Charset.forName("UTF-8")));
			String str = "";
			while ((str = localBufferedReader.readLine()) != null) {
				str = str.trim();
				if (str.length() > 0) {
					localArrayList.add(str);
				}
			}
			do
				this.c = ((String) localArrayList.get(a.nextInt(localArrayList
						.size())));
			while (this.c.hashCode() == 125780783);
		} catch (Exception localException) {
		}
		this.b = a.nextFloat();
	}

	public void a() {
		this.e += 1;
	}

	public boolean b() {
		return false;
	}

	protected void a(char paramChar, int paramInt) {
	}

	public void c() {
		this.f = this.p.p.a(new BufferedImage(256, 256, 2));

		Calendar localCalendar = Calendar.getInstance();
		localCalendar.setTime(new Date());

		if ((localCalendar.get(2) + 1 == 11) && (localCalendar.get(5) == 9))
			this.c = "Happy birthday, ez!";
		else if ((localCalendar.get(2) + 1 == 6) && (localCalendar.get(5) == 1))
			this.c = "Happy birthday, Notch!";
		else if ((localCalendar.get(2) + 1 == 12)
				&& (localCalendar.get(5) == 24))
			this.c = "Merry X-mas!";
		else if ((localCalendar.get(2) + 1 == 1) && (localCalendar.get(5) == 1)) {
			this.c = "Happy new year!";
		}

		adi localadi = adi.a();

		int i = this.r / 4 + 48;

		this.s.add(new abk(1, this.q / 2 - 100, i, localadi
				.b("menu.singleplayer")));
		this.s.add(this.d = new abk(2, this.q / 2 - 100, i + 24, localadi
				.b("menu.multiplayer")));
		this.s.add(new abk(3, this.q / 2 - 100, i + 48, localadi.b("menu.mods")));

		if (this.p.n) {
			this.s.add(new abk(0, this.q / 2 - 100, i + 72, localadi
					.b("menu.options")));
		} else {
			this.s.add(new abk(0, this.q / 2 - 100, i + 72 + 12, 98, 20,
					localadi.b("menu.options")));
			this.s.add(new abk(4, this.q / 2 + 2, i + 72 + 12, 98, 20, localadi
					.b("menu.quit")));
		}
		this.s.add(new adm(5, this.q / 2 - 124, i + 72 + 12));

		if (this.p.k == null)
			this.d.h = false;
	}

	protected void a(abk paramabk) {
		if (paramabk.f == 0) {
			this.p.a(new cb(this, this.p.A));
		}
		if (paramabk.f == 5) {
			this.p.a(new afq(this, this.p.A));
		}
		if (paramabk.f == 1) {
			this.p.a(new mt(this));
		}
		if (paramabk.f == 2) {
			this.p.a(new ack(this));
		}
		if (paramabk.f == 3) {
			this.p.a(new ej(this));
		}
		if (paramabk.f == 4)
			this.p.f();
	}

	private void b(int paramInt1, int paramInt2, float paramFloat) {
		adu localadu = adu.a;

		GL11.glMatrixMode(5889);
		GL11.glPushMatrix();
		GL11.glLoadIdentity();
		GLU.gluPerspective(120.0F, 1.0F, 0.05F, 10.0F);

		GL11.glMatrixMode(5888);
		GL11.glPushMatrix();
		GL11.glLoadIdentity();

		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);

		GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		GL11.glEnable(3042);
		GL11.glDisable(3008);

		GL11.glDisable(2884);
		GL11.glDepthMask(false);
		GL11.glBlendFunc(770, 771);

		int i = 8;

		for (int j = 0; j < i * i; j++) {
			GL11.glPushMatrix();
			float f1 = (j % i / i - 0.5F) / 64.0F;
			float f2 = (j / i / i - 0.5F) / 64.0F;
			float f3 = 0.0F;
			GL11.glTranslatef(f1, f2, f3);

			GL11.glRotatef(
					gh.a((this.e + paramFloat) / 400.0F) * 25.0F + 20.0F, 1.0F,
					0.0F, 0.0F);
			GL11.glRotatef(-(this.e + paramFloat) * 0.1F, 0.0F, 1.0F, 0.0F);

			for (int k = 0; k < 6; k++) {
				GL11.glPushMatrix();
				if (k == 1)
					GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
				if (k == 2)
					GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
				if (k == 3)
					GL11.glRotatef(-90.0F, 0.0F, 1.0F, 0.0F);
				if (k == 4)
					GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
				if (k == 5)
					GL11.glRotatef(-90.0F, 1.0F, 0.0F, 0.0F);
				GL11.glBindTexture(3553,
						this.p.p.b("/title/bg/panorama" + k + ".png"));
				localadu.b();
				localadu.a(16777215, 255 / (j + 1));
				float f4 = 0.0F;
				localadu.a(-1.0D, -1.0D, 1.0D, 0.0F + f4, 0.0F + f4);
				localadu.a(1.0D, -1.0D, 1.0D, 1.0F - f4, 0.0F + f4);
				localadu.a(1.0D, 1.0D, 1.0D, 1.0F - f4, 1.0F - f4);
				localadu.a(-1.0D, 1.0D, 1.0D, 0.0F + f4, 1.0F - f4);
				localadu.a();
				GL11.glPopMatrix();
			}
			GL11.glPopMatrix();
			GL11.glColorMask(true, true, true, false);
		}
		localadu.b(0.0D, 0.0D, 0.0D);
		GL11.glColorMask(true, true, true, true);

		GL11.glMatrixMode(5889);
		GL11.glPopMatrix();
		GL11.glMatrixMode(5888);
		GL11.glPopMatrix();
		GL11.glDepthMask(true);
		GL11.glEnable(2884);

		GL11.glEnable(3008);
		GL11.glEnable(2929);
	}

	private void a(float paramFloat) {
		GL11.glBindTexture(3553, this.f);
		GL11.glCopyTexSubImage2D(3553, 0, 0, 0, 0, 0, 256, 256);

		GL11.glEnable(3042);
		GL11.glBlendFunc(770, 771);
		GL11.glColorMask(true, true, true, false);
		adu localadu = adu.a;
		localadu.b();

		int i = 3;
		for (int j = 0; j < i; j++) {
			localadu.a(1.0F, 1.0F, 1.0F, 1.0F / (j + 1));
			int k = this.q;
			int m = this.r;
			float f1 = (j - i / 2) / 256.0F;
			localadu.a(k, m, this.g, 0.0F + f1, 0.0D);
			localadu.a(k, 0.0D, this.g, 1.0F + f1, 0.0D);
			localadu.a(0.0D, 0.0D, this.g, 1.0F + f1, 1.0D);
			localadu.a(0.0D, m, this.g, 0.0F + f1, 1.0D);
		}
		localadu.a();
		GL11.glColorMask(true, true, true, true);
	}

	private void c(int paramInt1, int paramInt2, float paramFloat) {
		GL11.glViewport(0, 0, 256, 256);
		b(paramInt1, paramInt2, paramFloat);
		GL11.glDisable(3553);
		GL11.glEnable(3553);

		a(paramFloat);
		a(paramFloat);
		a(paramFloat);
		a(paramFloat);
		a(paramFloat);
		a(paramFloat);
		a(paramFloat);
		a(paramFloat);
		GL11.glViewport(0, 0, this.p.d, this.p.e);

		adu localadu = adu.a;
		localadu.b();

		float f1 = this.q > this.r ? 120.0F / this.q : 120.0F / this.r;
		float f2 = this.r * f1 / 256.0F;
		float f3 = this.q * f1 / 256.0F;
		GL11.glTexParameteri(3553, 10241, 9729);
		GL11.glTexParameteri(3553, 10240, 9729);
		localadu.a(1.0F, 1.0F, 1.0F, 1.0F);
		int i = this.q;
		int j = this.r;
		localadu.a(0.0D, j, this.g, 0.5F - f2, 0.5F + f3);
		localadu.a(i, j, this.g, 0.5F - f2, 0.5F - f3);
		localadu.a(i, 0.0D, this.g, 0.5F + f2, 0.5F - f3);
		localadu.a(0.0D, 0.0D, this.g, 0.5F + f2, 0.5F + f3);
		localadu.a();
	}

	public void a(int paramInt1, int paramInt2, float paramFloat) {
		c(paramInt1, paramInt2, paramFloat);
		adu localadu = adu.a;

		int i = 274;
		int j = this.q / 2 - i / 2;
		int k = 30;

		a(0, 0, this.q, this.r, -2130706433, 16777215);
		a(0, 0, this.q, this.r, 0, -2147483648);

		GL11.glBindTexture(3553, this.p.p.b("/title/mclogo.png"));
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);

		if (this.b < 0.0001D) {
			b(j + 0, k + 0, 0, 0, 99, 44);
			b(j + 99, k + 0, 129, 0, 27, 44);
			b(j + 99 + 26, k + 0, 126, 0, 3, 44);
			b(j + 99 + 26 + 3, k + 0, 99, 0, 26, 44);
			b(j + 155, k + 0, 0, 45, 155, 44);
		} else {
			b(j + 0, k + 0, 0, 0, 155, 44);
			b(j + 155, k + 0, 0, 45, 155, 44);
		}

		localadu.c(16777215);
		GL11.glPushMatrix();
		GL11.glTranslatef(this.q / 2 + 90, 70.0F, 0.0F);

		GL11.glRotatef(-20.0F, 0.0F, 0.0F, 1.0F);
		float f1 = 1.8F - gh
				.e(gh.a((float) (System.currentTimeMillis() % 1000L) / 1000.0F * 3.141593F * 2.0F) * 0.1F);

		f1 = f1 * 100.0F / (this.u.a(this.c) + 32);
		GL11.glScalef(f1, f1, f1);
		a(this.u, this.c, 0, -8, 16776960);
		GL11.glPopMatrix();

		b(this.u, "Minecraft 1.2.3", 2, this.r - 10, 16777215);
		String str = "Copyright Mojang AB. Do not distribute!";
		b(this.u, str, this.q - this.u.a(str) - 2, this.r - 10, 16777215);

		super.a(paramInt1, paramInt2, paramFloat);
	}
}